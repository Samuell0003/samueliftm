

function validaLogin() {
    var user = document.getElementById("user");
    var password = document.getElementById("senha");
    if (!user.value) {
        //alert("Login");
        alertWifi("Usuário em branco", false, 0, "img/toupeira.gif", 30);
        user.focus();
    } else if (!password.value) {
        //alert("password");
        alertWifi("Senha em branco", false, 0, "img/toupeira.gif", 30);
        password.focus();
    } else {
        readJSON(user.value, password.value);
    }
}

function readJSON(user, password) {
    //file = 'https://wilton-filho.github.io/JS-GitHub/aulas/jogo/login/json/users2.json';
    file = "json/users.json";
    fetch(file)
        .then(response => response.json())
        .then(content => checkUser(content,user, password))
        .catch(err => console.log("erro na leitura do JSON"));
}

function checkUser(content,user, password) {
    var achou = false;
    for(i=0; i<content.usuarios.length; i++) {
        if (content.usuarios[i].user==user && content.usuarios[i].pwd==password) {
            achou = true;
            break;
        }
    }

    if (achou) {
        window.open("home.html","_self");
    } else {
        alertWifi("Usuario invalido", false, 0, "img/toupeira.gif", 30);

    }
}