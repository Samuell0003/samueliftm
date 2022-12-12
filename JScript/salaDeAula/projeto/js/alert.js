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

function finish() {
    //document.getElementById("tabuleiro").style.display="none";
    btnR = document.getElementById("btnR");
    btnL = document.getElementById("btnL");
    btnR.classList.add("btn","btnR");
    btnL.classList.add("btn", "btnL");
}