document.addEventListener("DOMContentLoaded", function () {
    loadBooks();
    loadUsers();
});

// Fetch Books from API
function loadBooks() {
    fetch("http://localhost:8080/api/books")  // Update API endpoint if necessary
        .then(response => response.json())
        .then(data => {
            const bookList = document.getElementById("book-list");
            bookList.innerHTML = "";
            data.forEach(book => {
                const row = document.createElement("tr");SS
                row.innerHTML = `
                    <td>${book.id}</td>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>${book.isbn}</td>
                    <td>${book.available ? "Yes" : "No"}</td>
                `;
                bookList.appendChild(row);
            });
        })
        .catch(error => console.error("Error loading books:", error));
}

// Fetch Users from API
function loadUsers() {
    fetch("http://localhost:8080/api/users")  // Update API endpoint if necessary
        .then(response => response.json())
        .then(data => {
            const userList = document.getElementById("user-list");
            userList.innerHTML = "";
            data.forEach(user => {
                const row = document.createElement("tr");
                row.innerHTML = `
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.role}</td>
                `;
                userList.appendChild(row);
            });
        })
        .catch(error => console.error("Error loading users:", error));
}
