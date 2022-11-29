function valida() {
    var name = document.getElementById("name");
    var num = document.getElementById("passa");
    var padrao = /^[A-Z][a-zA-Z ]{2,29}$/;
    if(!padrao.test(name.value)) {
        alert("Pare");
    } else {
        localStorage.setItem("valor",JSON.stringify({
            "nome": name.value,
            "num": num.value-2
        }));
        window.location.replace("aguarde.html");
    }

}


var contador = Math.floor(Math.random() * (10 - 5 + 1) ) + 5;
function play() {
    document.getElementById("cont").innerHTML = contador;
    setInterval(incrementar, 1000);
}

function incrementar() {
    document.getElementById("cont").innerHTML = --contador;
    if (contador==3) document.getElementById("cont").style.color="red";
    
    if (contador==0) window.location.replace("verVeiculo.html");
    

}


function veiculo() {
    var sam = JSON.parse(localStorage.getItem("valor"));
    veiculos = [{
        "img": "img/civic.jpg",
        "fabricante": "Honda",
        "nome": "civic",
        "potencia": "150 cv",
        "garantia": "3 anos",
        "consumo": "9,7 km/l"
    },{
        "img": "img/troller.jpg",
        "fabricante": "Ford",
        "nome": "troller",
        "potencia": "200 cv",
        "garantia": "3 anos",
        "consumo": "7,7 km/l"
    }];
    num = sam.num;
     nomeP = sam.nome;
     nomeP = nomeP.split(' ');
    document.getElementById("nomeP").innerHTML = nomeP[0];
    document.getElementById("imgV").src = veiculos[num].img;
    document.getElementById("fab").innerHTML = veiculos[num].fabricante;
    document.getElementById("name").innerHTML = veiculos[num].nome;
    document.getElementById("pot").innerHTML = veiculos[num].potencia;
    document.getElementById("gar").innerHTML = veiculos[num].garantia;
    document.getElementById("cid").innerHTML = veiculos[num].consumo;
    // document.getElementById
}