let inputMath = prompt("Hãy nhập điểm Toán");
let inputPhynics = prompt("Hãy nhập điểm Vật Lý");
let inputChemistry = prompt("Hãy nhập điểm Hóa Học");
Math = parseInt(inputMath);
Phynics = parseInt(inputPhynics);
Chemistry = parseInt(inputChemistry);
let average = (Math + Phynics + Chemistry) / 3;
let total = Math + Phynics + Chemistry;
document.write("Điểm trung bình là : " + average);
document.write("<br>");
document.write("Tổng điểm là : " + total);