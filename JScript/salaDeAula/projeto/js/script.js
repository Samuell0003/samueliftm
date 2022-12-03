var imagens = ['imgCircle','imgXis' ];
var imgAtual = 0;
var matriz;
var verif="";


function criarMatriz() {
    matriz = new Array(3);
    for (let i=0; i<3; i++) {
        matriz[i] = new Array(3);
    }
}

function criarTabuleiro() {
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
}

function inserirImg(evento) {
    document.getElementById(evento.currentTarget.id).classList.add(imagens[imgAtual]) ;
    vetIndice = evento.currentTarget.id.split("_");
    matriz[parseInt(vetIndice[0])][parseInt(vetIndice[1])] = imgAtual;

    (imgAtual >=1)?imgAtual=0:imgAtual++;

    verifica();
}

function verifica() {
    for (let i=0; i<3; i++) {
        for (let j=0; j<3; j++) {
            verif+=matriz[i][j];
            console.log(verif);
            if (verif==="111" || verif==="000") {
                alert();
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
            }
        }
        verif="";
    }

    for (let j=0; j<3; j++) {
        verif+=matriz[j][j];
        console.log(verif);
        if (verif==="111" || verif==="000") {
            alert();
        }
    }
    verif="";

    for (let j=0; j<3; j++) {
        verif+=matriz[j][2-j];
        console.log(verif);
        if (verif==="111" || verif==="000") {
            alert();
        }
    }
    verif="";
    
}