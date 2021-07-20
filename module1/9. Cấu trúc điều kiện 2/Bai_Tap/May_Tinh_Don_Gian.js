var input_value = "";

function set_num(value) {
    input_value += value;
    return document.getElementById("result").value = input_value;
}
function xoa() {
    input_value = "";
    return document.getElementById("result").value = input_value;
}
function ketqua() {
    return document.getElementById("result").value = eval(document.getElementById("result").value);
}