function BMI () {
    let weight = parseInt(document.getElementById("inputWeight").value);
    let height = parseInt(document.getElementById("inputHeight").value);
    let bmi = (weight / (height ^ 2));
    if (bmi < 18.5) {
        document.getElementById("Interpretation").innerText = "Underweight (Thiếu cân)";
    } else if (bmi < 25.0) {
        document.getElementById("Interpretation").innerText = "Normal (Bình thường)";
    } else if (bmi < 30.0) {
        document.getElementById("Interpretation").innerText = "Overweight (Thừa cân)";
    } else {
        document.getElementById("Interpretation").innerText = "Obese (Béo phì)";
    }
}
