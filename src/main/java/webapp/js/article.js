
async function fetch_content(topic){
    let response = await fetch("api/blog/get" ,
    {
        method : 'POST',
        headers: {
        'Content-Type': 'application/json;charset=utf-8'
    },
    body: JSON.stringify({
        topic: topic
    })
    }).then(data => console.log(data));

    console.log("before");
    let article = await response.json(); // read response body and parse as JSON
    console.log(article);

    console.log("after");
    document.getElementById("topic").innerHTML = article[1];

    document.getElementById("desc").innerHTML = article[2];

    document.getElementById("content").innerHTML = article[3];
}