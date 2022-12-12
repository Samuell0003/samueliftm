function ativar(txt) {
    divMessage = document.querySelector(".alert");
    divMessage.innerHTML="";
    message = document.createElement("div");
    message.classList.add("message");
    message.innerText = txt;
    divMessage.appendChild(message);

    setTimeout(()=>{
        message.style.display="none";
        }, 3000);
}

function jogador(txt) {
    divMessage = document.querySelector(".alert");
    message = document.getElementById("jg");
    message.classList.add("jogador");
    message.innerText = txt;
    divMessage.appendChild(message);

}