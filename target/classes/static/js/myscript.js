const popUp = document.getElementById("pop-up-form");

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
    popUp.style.display = "block";
}
function closeForm() {
	//console.log("Closing form...");
    popUp.style.display = "none";
}
// When the user clicks anywhere outside of the modal, close it
/*window.onclick = function (event) {
    const modal = document.getElementById('pop-up-form');
      //closeForm();
      //console.log(event.target);
    //console.log(modal);
    if (event.target !== modal) {
        closeForm();
    }
}*/

/*window.addEventListener('click', (event) => {
    if (event.target !== popUp && !popUp.contains(event.target)) {
        closeForm();
    }
});*/
