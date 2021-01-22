let login_form = document.getElementById('login');

login_form.addEventListener('submit', async (e) => {
    e.preventDefault();
    e.stopPropagation();
    if (login_form.checkValidity() === true) {
        document.getElementById("submit-button").style.display = "none";
        document.getElementById("spinner-button").style.display = "block";
        let response = await fetch('api/user/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            },
            body: JSON.stringify({
                email: document.getElementById('username').value,
                password: document.getElementById('pswd').value
            })
        });

        let result = await response;
        if(result["status"]===200){
            let data = response.json();
            document.getElementById("submit-button").style.display = "block";
            document.getElementById("spinner-button").style.display = "none";


            location.href = "afterLogin.html";
        }else{
            console.log("not executed");
            document.getElementById("login-alert").style.display = "block";

            location.reload();

        }

    }
});