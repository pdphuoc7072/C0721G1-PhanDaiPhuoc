let Good = document.getElementById("good");
let Fast = document.getElementById("fast");
let Cheap = document.getElementById("cheap");

function Changed(value) {
 isGood = Good.checked;
 isFast = Fast.checked;
 isCheap = Cheap.checked;

 if (isGood && isFast && isCheap && value == Cheap) {
     Fast.checked = false;
 }
 if (isCheap && isFast && isGood && value == Good) {
     Cheap.checked = false;
 }
 if (isGood && isCheap && isFast && value == Fast) {
    Good.checked = false;
 }
}

