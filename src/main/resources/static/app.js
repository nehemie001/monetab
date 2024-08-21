document.addEventListener("DOMContentLoaded", function () {
  loadPage("menu.html");
});
// Get the file professeurs
document.getElementById("tab-prof").addEventListener("click", function (event) {
  event.preventDefault();

  fetch("/teacher")
    .then((response) => response.text())
    .then((data) => {
      document.getElementById("content").innerHTML = data;

      var firstmenu = document.getElementById("firstmenu");
      firstmenu.style.display = "none"

      document
        .getElementById("tab-create-prof")
        .addEventListener("click", function (event) {
          event.preventDefault();

          // Create a prof
          fetch("Professeurs/create.html")
            .then((response) => response.text())
            .then((data) => {
              document.getElementById("content").innerHTML = data;
            })
            .catch((error) => console.error("erreur", error));
        });
    })
    .catch((error) => console.error("erreur", error));

  // Update prof
  document
    .getElementById("updateProf")
    .addEventListener("click", function (event) {
      event.preventDefault();

      fetch("Professeurs/update.html")
        .then((response) => response.text())
        .then((data) => {
          document.getElementById("content").innerHTML = data;
        })
        .catch((error) => console.error("erreur", error));
    });
});

// Get the file eleves
document
  .getElementById("tab-eleve")
  .addEventListener("click", function (event) {
    event.preventDefault();

    fetch("/student")
      .then((response) => response.text())
      .then((data) => {
        document.getElementById("content").innerHTML = data;

//        Create a student
        document
          .getElementById("tab-create-eleve")
          .addEventListener("click", function (event) {
            event.preventDefault();

            fetch("Eleves/create.html")
              .then((response) => response.text())
              .then((data) => {
                document.getElementById("content").innerHTML = data;
              })
              .catch((error) => console.error("erreur", error));
          });

        // Update student
        document
          .getElementById("updateStudent")
          .addEventListener("click", function (event) {
            event.preventDefault();

            fetch("Eleves/update.html")
              .then((response) => response.text())
              .then((data) => {
                document.getElementById("content").innerHTML = data;
              })
              .catch((error) => console.error("erreur", error));
          });
      })
      .catch((error) => console.error("erreur", error));
  });

// Get the file users
document.getElementById("tab-user").addEventListener("click", function (event) {
  event.preventDefault();

  fetch("/user")
    .then((response) => response.text())
    .then((data) => {
      document.getElementById("content").innerHTML = data;

      // Create a user
      document
        .getElementById("tab-create-user")
        .addEventListener("click", function (event) {
          event.preventDefault();

          fetch("Utilisateurs/create.html")
            .then((response) => response.text())
            .then((data) => {
              document.getElementById("content").innerHTML = data;
            })
            .catch((error) => console.error("erreur", error));
        });

      // Update student
      document
        .getElementById("updateStudent")
        .addEventListener("click", function (event) {
          event.preventDefault();

          fetch("Eleves/update.html")
            .then((response) => response.text())
            .then((data) => {
              document.getElementById("content").innerHTML = data;
            })
            .catch((error) => console.error("erreur", error));
        });
    })
    .catch((error) => console.error("erreur", error));
});

// Get the file menu
document
  .getElementById("dashboard")
  .addEventListener("click", function (event) {
    event.preventDefault();

    fetch("menu.html")
      .then((response) => response.text())
      .then((data) => {
        document.getElementById("content").innerHTML = data;
      })
      .catch((error) => console.error("erreur", error));
  });

// Get the file menu
document
  .getElementById("tab-rapport")
  .addEventListener("click", function (event) {
    event.preventDefault();

    fetch("Rapports/index.html")
      .then((response) => response.text())
      .then((data) => {
        document.getElementById("content").innerHTML = data;
      })
      .catch((error) => console.error("erreur", error));
  });

// Script for Modal

function openModalDelete() {
  var closeModal = document.getElementById("closeModal");
  closeModal.style.display = "flex";
}

function btnClose() {
  var closeModal = document.getElementById("closeModal");
  closeModal.style.display = "none";
}

// Login button connect
function loginBtn() {
  document.getElementById("dashboard.html")
}
