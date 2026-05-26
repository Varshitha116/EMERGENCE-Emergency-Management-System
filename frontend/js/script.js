function triggerMedicalEmergency() {

    alert("Medical Emergency Triggered!");

    let table =
        document.getElementById("alertTableBody");

    let row =
        document.createElement("tr");

    row.innerHTML = `
        <td>Medical Emergency</td>
        <td>Hyderabad</td>
        <td style="color:red;">
            ACTIVE
        </td>
    `;

    table.appendChild(row);

    updateAlertCount();
}
function sendSOS() {

    const response = {
        status: "success",
        message: "SOS Alert Sent"
    };

    alert(response.message);

    console.log("SOS sent to backend...");
}

function viewContacts() {

    alert(
        "Mother - 9876543210\nBrother - 9123456780"
    );
}

function loginUser() {

    alert("Login Successful!");

    window.location.href = "dashboard.html";
}

function registerUser() {

    alert("Registration Successful!");

    window.location.href = "login.html";
}
function addContact() {

    let name =
        document.getElementById("contactName").value;

    let relation =
        document.getElementById("contactRelation").value;

    let phone =
        document.getElementById("contactPhone").value;

    if(name === "" || relation === "" || phone === "") {

        alert("Please fill all fields");

        return;
    }

    let tableBody =
        document.querySelector("#contactTable tbody");

    let row =
        document.createElement("tr");

    row.innerHTML = `
        <td>${name}</td>
        <td>${relation}</td>
        <td>${phone}</td>
        <td>
            <button onclick="deleteContact(this)">
                Delete
            </button>
        </td>
    `;

    tableBody.appendChild(row);
    updateContactCount();
    document.getElementById("contactName").value = "";

    document.getElementById("contactRelation").value = "";

    document.getElementById("contactPhone").value = "";
}

function deleteContact(button) {

    let row = button.parentNode.parentNode;

    row.remove();
    updateContactCount();

    alert("Contact Deleted");
}
function updateContactCount() {

    let rows =
        document.querySelectorAll("#contactTable tbody tr");

    document.getElementById("contactCount").innerText =
        rows.length;
}
function updateAlertCount() {

    let rows =
        document.querySelectorAll("#alertTableBody tr");

    document.getElementById("alertCount").innerText =
        rows.length;
}