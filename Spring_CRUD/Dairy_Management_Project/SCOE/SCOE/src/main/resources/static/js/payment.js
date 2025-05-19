function fetchPayments() {
    let fromDate = document.getElementById("fromDate").value;
    let toDate = document.getElementById("toDate").value;

    $.ajax({
        url: `http://localhost:9090/api/payments?from=${fromDate}&to=${toDate}`,
        method: "GET",
        success: function(response) {
            let tableBody = $("#paymentTable");
            tableBody.empty();
            response.forEach((payment, index) => {
                tableBody.append(`
                    <tr>
                        <td>${index + 1}</td>
                        <td>${payment.farmerId}</td>
                        <td>${payment.farmerName}</td>
                        <td>${payment.lastPaidOn}</td>
                        <td>${payment.totalLiters}</td>
                        <td><button class="btn btn-success" onclick="processPayment(${payment.farmerId})">Pay</button></td>
                    </tr>
                `);
            });
        },
        error: function(error) {
            console.error("Error fetching payments", error);
        }
    });
}

function processPayment(farmerId) {
    $.ajax({
        url: `http://localhost:9090/api/payments/pay/${farmerId}`,
        method: "POST",
        success: function() {
            alert("Payment successful!");
            fetchPayments();
        },
        error: function(error) {
            alert("Payment failed.");
            console.error("Payment error", error);
        }
    });
}
