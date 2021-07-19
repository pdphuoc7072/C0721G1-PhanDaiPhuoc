function calculate(value) {
    let A = document.getElementById("inputA").value;
    let B = document.getElementById("inputB").value;
    a = parseInt(A);
    b = parseInt(B);
    if (value == "+") {
        let c = a + b;
        document.getElementById("result").innerText = c;
    } else if (value == "-") {
        let c = a - b;
        document.getElementById("result").innerText = c;
    } else if (value == "*") {
        let c = a * b;
        document.getElementById("result").innerText = c;
    } else if (value == "/") {
        let c = a / b;
        document.getElementById("result").innerText = c;
    }
}