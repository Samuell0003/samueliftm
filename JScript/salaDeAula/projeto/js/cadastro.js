function validaCadastro() {
    var user = document.getElementById("user");
    var senha = document.getElementById("senha");
    var confirmSenha = document.getElementById("confirmSenha");

    if (!user.value) {
        alertWifi("Usuário em branco", false, 0, "img/toupeira.gif", 30);
        user.focus();
    } else if (!senha.value) {
        alertWifi("Senha em branco", false, 0, "img/toupeira.gif", 30);
        senha.focus();
    } else if (!confirmSenha.value) {
        alertWifi("Confirme a senha", false, 0, "img/toupeira.gif", 30);
        confirmSenha.focus();
    } else if (senha.value!=confirmSenha.value) {
        alertWifi("Senhas diferentes", false, 0, "img/toupeira.gif", 30);
        confirmSenha.focus();
    } else {
        readJSON(user.value, senha.value);
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
        if (content.usuarios[i].user==user) {
            achou = true;
            break;
        }
    }

    if (achou) {
        alertWifi("Usuario já existe", false, 0, "img/toupeira.gif", 30);
    } else {
        document.getElementById("cadastr").submit();
    }
}