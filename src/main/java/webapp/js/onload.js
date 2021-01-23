window.onload=isLoggedin();

function isLoggedin() {
    const token = localStorage.getItem('name');
    if (token) {
        location.href = "afterLogin.html";
    }
}
