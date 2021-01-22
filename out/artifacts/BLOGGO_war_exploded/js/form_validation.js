let user_form = document.getElementById('signup');


user_form.addEventListener('submit', async (e) => {
    e.preventDefault();
    e.stopPropagation();
    if (user_form.checkValidity() === true) {
        let response = await fetch('api/user/register', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            },
            body: JSON.stringify({
                firstname: document.getElementById('first_name').value,
                lastname: document.getElementById('last_name').value,
                email: document.getElementById('email').value,
                password: document.getElementById('psw').value
            })
        }).then(
            response => {
                if(response['status'] === 203){
                    document.getElementById("signup-success").style.display = "none";
                    document.getElementById("signup-alert").style.display = "block";
                    location.href="indexPage.html"

                }else{
                    document.getElementById("signup-alert").style.display = "none";
                    document.getElementById("signup-success").style.display = "block";

                }
            })
    }
     else{
        user_form.classList.add('was-validated');
    }

});
