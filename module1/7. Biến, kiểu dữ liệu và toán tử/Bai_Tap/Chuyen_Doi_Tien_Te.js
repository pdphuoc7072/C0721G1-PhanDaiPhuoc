function convert() {
    let a = document.getElementById("amount").value;
    let b = document.getElementById("select1").value;
    let c = document.getElementById("select2").value;
    let result;
    if (b == "VND" && c == "VND") {
        result = a * 1;
        document.getElementById("result").innerText = result;
    } else if (b == "VND" && c == "USD") {
        result = a / 23000;
        document.getElementById("result").innerText = result;
    } else if (b == "VND" && c == "JPY") {
        result = a / 200;
        document.getElementById("result").innerText = result;
    } else if (b == "USD" && c == "VND"){
        result = a * 23000;
        document.getElementById("result").innerText = result;
    } else if (b == "USD" && c == "USD") {
        result = a * 1;
        document.getElementById("result").innerText = result;
    } else if (b == "USD" && c == "JPY") {
        result = a * 115;
        document.getElementById("result").innerText = result;
    } else if (b == "JPY" && c == "VND"){
        result = a * 200;
        document.getElementById("result").innerText = result;
    } else if (b == "JPY" && c == "USD") {
        result = a / 115;
        document.getElementById("result").innerText = result;
    } else if (b == "JPY" && c == "JPY") {
        result = a * 1;
        document.getElementById("result").innerText = result;
    }
}