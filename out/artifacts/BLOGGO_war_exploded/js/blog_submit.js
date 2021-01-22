blog_content=document.getElementById('blog');

blog_content.addEventListener("submit",async(e)=> {
    e.preventDefault();
    e.stopPropagation();
    if (blog_content.checkValidity() === true) {
        let response = await fetch('api/blog/content', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            },
            body: JSON.stringify({
                topic: document.getElementById('topic').value,
                description: document.getElementById('desc').value,
                body: document.getElementById('body').value
            })
        }).then(
            response => {
                if(response['status'] === 203){
                    document.getElementById("on-success").style.display = "none";

                }else{
                    document.getElementById("on-success").style.display = "block";
                    location.href="afterLogin.html"

                }
            })
    }
    else{
        user_form.classList.add('was-validated');
    }

})
