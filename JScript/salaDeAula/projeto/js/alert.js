function ativar(txt) {
    divMessage = document.querySelector(".alert");
    message = document.createElement("div");
    message.classList.add("message");
    message.innerText = txt;
    divMessage.appendChild(message);

    setTimeout(()=>{
        message.style.display="none";
        }, 3000);
}