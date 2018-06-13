function processar1(){
    document.getElementById("selectDoPeriodo1").disabled = false;
    document.getElementById("option2").selected = true;
    document.getElementById("option3").selected = true;
    document.getElementById("option4").selected = true;
    document.getElementById("option5").selected = true;
    document.getElementById("selectDoPeriodo2").disabled = true;
    document.getElementById("selectDoPeriodo3").disabled = true;
    document.getElementById("selectDoPeriodo4").disabled = true;
    document.getElementById("selectDoPeriodo5").disabled = true;
}

function processar2() {
    document.getElementById("selectDoPeriodo2").disabled = false;
    document.getElementById("option1").selected = true;
    document.getElementById("option3").selected = true;
    document.getElementById("option4").selected = true;
    document.getElementById("option5").selected = true;
    document.getElementById("selectDoPeriodo1").disabled = true;
    document.getElementById("selectDoPeriodo3").disabled = true;
    document.getElementById("selectDoPeriodo4").disabled = true;
    document.getElementById("selectDoPeriodo5").disabled = true;
}

function processar3(){
    document.getElementById("selectDoPeriodo3").disabled = false;
    document.getElementById("option1").selected = true;
    document.getElementById("option2").selected = true;
    document.getElementById("option4").selected = true;
    document.getElementById("option5").selected = true;
    document.getElementById("selectDoPeriodo1").disabled = true;
    document.getElementById("selectDoPeriodo2").disabled = true;
    document.getElementById("selectDoPeriodo4").disabled = true;
    document.getElementById("selectDoPeriodo5").disabled = true;
}

function processar4(){
    document.getElementById("selectDoPeriodo4").disabled = false;    
    document.getElementById("option1").selected = true;
    document.getElementById("option2").selected = true;
    document.getElementById("option3").selected = true;
    document.getElementById("option5").selected = true;
    document.getElementById("selectDoPeriodo1").disabled = true;
}

function processar5(){
    document.getElementById("selectDoPeriodo5").disabled = false;
    document.getElementById("option1").selected = true;
    document.getElementById("option2").selected = true;
    document.getElementById("option3").selected = true;
    document.getElementById("option4").selected = true;
    document.getElementById("selectDoPeriodo1").disabled = true;
    document.getElementById("selectDoPeriodo2").disabled = true;
    document.getElementById("selectDoPeriodo3").disabled = true;
    document.getElementById("selectDoPeriodo4").disabled = true;
}



