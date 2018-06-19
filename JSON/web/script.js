var xmlHttpRequest;
xmlHttpRequest = new XMLHttpRequest();

xmlHttpRequest.onreadystatechange = function () {

    if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200) {
        var obj  = JSON.parse(XMLHttpRequest.responseText);
        document.getElementById("campoNome2").value = obj.nome;
        document.getElementById("campoIdade2").value = obj.idade;
        

    }
}

function enviar() {
    
    xmlHttpRequest.open("GET", "http://localhost:8080/JSON/Servlet?campo=aaa", true);
    xmlHttpRequest.send();
    
}

    

