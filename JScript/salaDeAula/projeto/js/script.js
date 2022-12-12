var imagens = ['imgCircle','imgXis' ];
var sam = JSON.parse(localStorage.getItem("users"));
var jogadorAtual = [sam.user1,sam.user2];
var imgAtual = 0;
var matriz;
var verif="";

function criarMatriz() {
    matriz = new Array(3);
    for (let i=0; i<3; i++) {
        matriz[i] = new Array(3);
    }
}
function userLogin() {
    if (!localStorage.getItem("posUser")) window.open("index.html", "_self");
}
function criarTabuleiro() {

    if (!localStorage.getItem("users")) window.open("users.html", "_self");

    criarMatriz();
    for (let i=0; i<3; i++) {
        for (let j=0; j<3; j++) {
            var div = document.createElement("div");
            div.setAttribute("class","boxTabuleiro imgTabuleiro ");
            div.setAttribute("id",`${i}_${j}`);
            div.addEventListener("click", inserirImg);
            document.getElementById("tabuleiro").appendChild(div);
            matriz[i][j]="";
        }
    }
    jogador(jogadorAtual[imgAtual]);
}

function inserirImg(evento) {
    document.getElementById(evento.currentTarget.id).classList.add(imagens[imgAtual]) ;
    vetIndice = evento.currentTarget.id.split("_");
    matriz[parseInt(vetIndice[0])][parseInt(vetIndice[1])] = imgAtual;

    (imgAtual >=1)?imgAtual=0:imgAtual++;
    verifica();
    jogador(jogadorAtual[imgAtual]);
}

function verifica() {
    for (let i=0; i<3; i++) {
        for (let j=0; j<3; j++) {
            verif+=matriz[i][j];
            console.log(verif);
            if (verif==="111" || verif==="000") {
                alert();
                break;
            }
        }
        verif="";
    }


    for (let i=0; i<3; i++) {
        for (let j=0; j<3; j++) {
            verif+=matriz[j][i];
            console.log(verif);
            if (verif==="111" || verif==="000") {
                alert();
                break;
            }
        }
        verif="";
    }

    for (let j=0; j<3; j++) {
        verif+=matriz[j][j];
        console.log(verif);
        if (verif==="111" || verif==="000") {
            alert();
            break;
        }
    }
    verif="";

    for (let j=0; j<3; j++) {
        verif+=matriz[j][2-j];
        console.log(verif);
        if (verif==="111" || verif==="000") {
            alert();
            break;
        }
    }
    verif="";
    
}

function verificaUsers() {
    var user1 = document.getElementById("user1").value;
    var user2 = document.getElementById("user2").value;

    if(!user1) user1 = "Jogador 1";
    if(!user2) user2 = "Jogador 2";

    localStorage.setItem("users",JSON.stringify(
        {"user1":user1, "user2":user2}
    ));

    window.open("home.html","_self");
}


