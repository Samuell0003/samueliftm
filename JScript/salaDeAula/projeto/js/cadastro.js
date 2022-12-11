function validaCadastro() {
    var user = document.getElementById("user");
    var senha = document.getElementById("senha");
    var confirmSenha = document.getElementById("confirmSenha");

    if (!user.value) {
        ativar("Usuário em branco");
        user.focus();
    } else if (!senha.value) {
        ativar("Senha em branco");
        senha.focus();
    } else if (!confirmSenha.value) {
        ativar("Confirme a senha");
        confirmSenha.focus();
    } else if (senha.value!=confirmSenha.value) {
        ativar("Senhas diferentes");
        confirmSenha.focus();
    } else {
        readJSON(user.value, senha.value);
    }
}

function readJSON(user, password) {
    file = "json/users.json";
    fetch(file)
        .then(response => response.json())
        .then(content => checkUser(content,user, password))
        .catch(err => console.log("erro na leitura do JSON"));
}

function checkUser(content,user, password) {
    var achou = false;
    for(i=0; i<content.usuarios.length; i++) {
        if (content.usuarios[i].user==user) {
            achou = true;
            break;
        }
    }

    if (achou) {
        ativar("Usuário já existente!");
    } else {
        document.getElementById("cadastr").submit();
    }
}