function convert() {
    let a = parseInt(document.getElementById("amount").value);
    let b = parseInt(document.getElementById("select1").value);
    let c = parseInt(document.getElementById("select2").value);
    let result = a * b / c;
    document.getElementById("result").innerText = result;
}