
//Adding show password
function showPassword() {
    const x = document.getElementById("user-input");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }
}

function openForm() {
    document.getElementById("pop-up-form").style.display = "block";
}
function closeForm() {
    document.getElementById("pop-up-form").style.display = "none";
}
// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    const modal = document.getElementById('pop-up-form');
    if (event.target = modal) {
        closeForm();
    }
}