var imagens = ['imgCircle', 'imgXis'];
var sam = JSON.parse(localStorage.getItem("users"));
var jogadorAtual = [sam.user1, sam.user2];
var imgAtual = 0;
var matriz;
var cont = 0;
const error = new Audio('music/error.mp3');
const empate = new Audio('music/empate.mp3');
const jogada = new Audio('music/jogada.mp3');

function criarMatriz() {
    matriz = new Array(3);
    for (let i = 0; i < 3; i++) {
        matriz[i] = new Array(3);
    }
}

function userLogin() {
    if (!localStorage.getItem("posUser")) window.open("index.html", "_self");
}

function criarTabuleiro() {

    if (!localStorage.getItem("users")) window.open("users.html", "_self");

    criarMatriz();
    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            var div = document.createElement("div");
            div.setAttribute("class", "boxTabuleiro imgTabuleiro ");
            div.setAttribute("id", `${i}_${j}`);
            div.addEventListener("click", inserirImg);
            document.getElementById("tabuleiro").appendChild(div);
            matriz[i][j] = "";
        }
    }
    jogador(jogadorAtual[imgAtual]);
}

function inserirImg(evento) {
    vetIndice = evento.currentTarget.id.split("_");

    if (matriz[parseInt(vetIndice[0])][parseInt(vetIndice[1])] !== '') {
        error.play();
    } else {
        document.getElementById(evento.currentTarget.id).classList.add(imagens[imgAtual]);
        matriz[parseInt(vetIndice[0])][parseInt(vetIndice[1])] = imgAtual;
        if (verifica()) {
            error.play();
            jogador(jogadorAtual[imgAtual]);
        } else {
            (imgAtual == 0) ? imgAtual = 1 : imgAtual = 0;
            jogador(jogadorAtual[imgAtual]);
            jogada.play();
        }
    }


}

function verifica() {
    cont++;
    verif = "";
    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            verif += matriz[i][j];
            if (verif === "111" || verif === "000") {
                jogadorAtual.push(jogadorAtual[imgAtual] + " é o vencedor!");
                imgAtual = 2;
                finish();
                return true;
            }
        }
        verif = "";
    }


    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            verif += matriz[j][i];
            if (verif === "111" || verif === "000") {
                jogadorAtual.push(jogadorAtual[imgAtual] + " é o vencedor!");
                imgAtual = 2;
                finish();
                return true;
            }
        }
        verif = "";
    }

    for (let j = 0; j < 3; j++) {
        verif += matriz[j][j];
        if (verif === "111" || verif === "000") {
            jogadorAtual.push(jogadorAtual[imgAtual] + " é o vencedor!");
            imgAtual = 2;
            finish();
            return true;
        }
    }
    verif = "";

    for (let j = 0; j < 3; j++) {
        verif += matriz[j][2 - j];
        if (verif === "111" || verif === "000") {
            jogadorAtual.push(jogadorAtual[imgAtual] + " é o vencedor!");
            imgAtual = 2;
            finish();
            return true;
        }
    }
    verif = "";

    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            if (matriz[i][j] !== '' && cont >= 9) {
                jogadorAtual.push("Empate");
                imgAtual = 2;
                finish();
                empate.play();
                return true;
            }
        }
    }

    return false;
}

function verificaUsers() {
    var user1 = document.getElementById("user1").value;
    var user2 = document.getElementById("user2").value;

    if (!user1) user1 = "Jogador 1";
    if (!user2) user2 = "Jogador 2";

    localStorage.setItem("users", JSON.stringify(
        { "user1": user1, "user2": user2 }
    ));

    window.open("home.html", "_self");
}


