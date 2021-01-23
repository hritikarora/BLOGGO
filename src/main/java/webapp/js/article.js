
window.onload=fetch_content(localStorage.getItem("topic"));

async function fetch_content(topic){

        const token = localStorage.getItem('name');
        if (!token)
        {
            window.alert("please login to view this");
            location.href="indexPage.html";
        }

    let response = await fetch("api/blog/get" ,
    {
        method : 'POST',
        headers: {
        'Content-Type': 'application/json;charset=utf-8'
    },
    body: JSON.stringify({
        topic: topic
    })
    });

    console.log("before");
    let article = await response.json(); // read response body and parse as JSON
    console.log(article);

    console.log("after");
    document.getElementById("topic").innerHTML = article['topic'];

    document.getElementById("desc").innerHTML = article['description'];

    document.getElementById("content").innerHTML = article['body'];

    document.getElementById("img").innerHTML = article['image'];
}