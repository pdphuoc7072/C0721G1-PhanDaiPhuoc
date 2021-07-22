let slider_1 = document.getElementById("slider_1");
let slider_2 = document.getElementById("slider_2");
let slider_3 = document.getElementById("slider_3");
let slider_4 = document.getElementById("slider_4");
let slider_5 = document.getElementById("slider_5");

function onChange(value) {
    switch (value) {
        case 1: {
            if (slider_1.getAttribute("src") === "Game_Puzzle_Images/cat_1.jpg") {
                slider_1.src = "Game_Puzzle_Images/monkey_1.jpg";
            } else if (slider_1.getAttribute("src") === "Game_Puzzle_Images/monkey_1.jpg") {
                slider_1.src = "Game_Puzzle_Images/panda_1.jpg";
            } else if (slider_1.getAttribute("src") === "Game_Puzzle_Images/panda_1.jpg") {
                slider_1.src = "Game_Puzzle_Images/cat_1.jpg";
            }
            perfect();
            break;
        }
        case 2: {
            if (slider_2.getAttribute("src") === "Game_Puzzle_Images/cat_2.jpg") {
                slider_2.src = "Game_Puzzle_Images/monkey_2.jpg";
            } else if (slider_2.getAttribute("src") === "Game_Puzzle_Images/monkey_2.jpg") {
                slider_2.src = "Game_Puzzle_Images/panda_2.jpg";
            } else if (slider_2.getAttribute("src") === "Game_Puzzle_Images/panda_2.jpg") {
                slider_2.src = "Game_Puzzle_Images/cat_2.jpg";
            }
            perfect();
            break;
        }
        case 3: {
            if (slider_3.getAttribute("src") === "Game_Puzzle_Images/cat_3.jpg") {
                slider_3.src = "Game_Puzzle_Images/monkey_3.jpg";
            } else if (slider_3.getAttribute("src") === "Game_Puzzle_Images/monkey_3.jpg") {
                slider_3.src = "Game_Puzzle_Images/panda_3.jpg";
            } else if (slider_3.getAttribute("src") === "Game_Puzzle_Images/panda_3.jpg") {
                slider_3.src = "Game_Puzzle_Images/cat_3.jpg";
            }
            perfect();
            break;
        }
        case 4: {
            if (slider_4.getAttribute("src") === "Game_Puzzle_Images/cat_4.jpg") {
                slider_4.src = "Game_Puzzle_Images/monkey_4.jpg";
            } else if (slider_4.getAttribute("src") === "Game_Puzzle_Images/monkey_4.jpg") {
                slider_4.src = "Game_Puzzle_Images/panda_4.jpg";
            } else if (slider_4.getAttribute("src") === "Game_Puzzle_Images/panda_4.jpg") {
                slider_4.src = "Game_Puzzle_Images/cat_4.jpg";
            }
            perfect();
            break;
        }
        case 5: {
            if (slider_5.getAttribute("src") === "Game_Puzzle_Images/cat_5.jpg") {
                slider_5.src = "Game_Puzzle_Images/monkey_5.jpg";
            } else if (slider_5.getAttribute("src") === "Game_Puzzle_Images/monkey_5.jpg") {
                slider_5.src = "Game_Puzzle_Images/panda_5.jpg";
            } else if (slider_5.getAttribute("src") === "Game_Puzzle_Images/panda_5.jpg") {
                slider_5.src = "Game_Puzzle_Images/cat_5.jpg";
            }
            perfect();
            break;
        }
    }
}

function perfect() {
    if ((slider_1.getAttribute("src") === "Game_Puzzle_Images/cat_1.jpg") &&
        (slider_2.getAttribute("src") === "Game_Puzzle_Images/cat_2.jpg") &&
        (slider_3.getAttribute("src") === "Game_Puzzle_Images/cat_3.jpg") &&
        (slider_4.getAttribute("src") === "Game_Puzzle_Images/cat_4.jpg") &&
        (slider_5.getAttribute("src") === "Game_Puzzle_Images/cat_5.jpg")) {
        alert("Đây là hình con mèo!!!");
    }
    if ((slider_1.getAttribute("src") === "Game_Puzzle_Images/monkey_1.jpg") &&
        (slider_2.getAttribute("src") === "Game_Puzzle_Images/monkey_2.jpg") &&
        (slider_3.getAttribute("src") === "Game_Puzzle_Images/monkey_3.jpg") &&
        (slider_4.getAttribute("src") === "Game_Puzzle_Images/monkey_4.jpg") &&
        (slider_5.getAttribute("src") === "Game_Puzzle_Images/monkey_5.jpg")) {
        alert("Đây là hình con khỉ!!!");
    }
    if ((slider_1.getAttribute("src") === "Game_Puzzle_Images/panda_1.jpg") &&
        (slider_2.getAttribute("src") === "Game_Puzzle_Images/panda_2.jpg") &&
        (slider_3.getAttribute("src") === "Game_Puzzle_Images/panda_3.jpg") &&
        (slider_4.getAttribute("src") === "Game_Puzzle_Images/panda_4.jpg") &&
        (slider_5.getAttribute("src") === "Game_Puzzle_Images/panda_5.jpg")) {
        alert("Đây là hình con gấu trúc!!!");
    }
}