import dateHandler from "../utils/dateHandler.js";

var html = '';
const carHelper = {};

carHelper.buildCarListInScreen = function (carsList) {
    for (let car of carsList) {
        buildCarLine(car);
    }
    showCarSnippetInScreen();
}

carHelper.getIdCar = function (carElement) {
    return carElement.data('car-id');
}

function buildCarLine(car) {
    let adjustedDate = dateHandler.adjustDateHourForBrazilView(car.createdAt);

    html += "<tr>";
    html += "<td>" + car.name + "</td>";
    html += "<td>" + car.brandName + "</td>";
    html += "<td>" + car.yearFabrication + "</td>";
    html += "<td>" + car.categoryTypeName + "</td>";
    html += "<td>" + adjustedDate + "</td>";
    html += "<td>";
    html += "<a href=\"#\" class=\"edit editCar\" data-car-id=\""+ car.id +"\" ><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>";
    html += "<a href=\"#\" class=\"delete\" id=\"deleteCar\" data-car-id=\""+ car.id +"\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>";
    html += "</td>";
    html += "</tr>";
}

function showCarSnippetInScreen() {
    $("#main-content-place-car-list").append(html);
}

export default carHelper;