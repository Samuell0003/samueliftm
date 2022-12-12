

function validaLogin() {
    var user = document.getElementById("user");
    var password = document.getElementById("senha");
    if (!user.value) {
        ativar("Usuário em branco!");
        user.focus();
    } else if (!password.value) {
        ativar("Senha em branco!");
        password.focus();
    } else {
        readJSON(user.value, password.value);
    }
}

function readJSON(user, password) {
    file = "json/users.json";
    fetch(file)
        .then(response => response.json())
        .then(content => checkUser(content, user, password))
        .catch(err => console.log("erro na leitura do JSON"));
}

function checkUser(content, user, password) {
    var achou = false;
    for (i = 0; i < content.usuarios.length; i++) {
        if (content.usuarios[i].user == user && content.usuarios[i].pwd == password) {
            achou = true;
            localStorage.setItem("posUser", i);
            break;
        }
    }

    if (achou) {
        window.open("users.html", "_self");
    } else {
        console.log("1");
        ativar("Usuário ou senha incorreto!");

    }
}
