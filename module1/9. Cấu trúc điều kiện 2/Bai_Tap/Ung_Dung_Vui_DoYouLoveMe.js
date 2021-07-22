function abc() {
    alert("Yes. You are right!!!")
}
function xyz() {
    let width = window.innerWidth;
    let height = window.innerHeight;
    let random_left = Math.random () * width;
    let random_top = Math.random () * height;
    document.getElementById("no").style.position = "relative";
    document.getElementById("no").style.left = random_left + "px";
    document.getElementById("no").style.top = random_top + "px";
}