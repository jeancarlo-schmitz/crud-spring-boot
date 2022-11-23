import dateHandler from "../utils/dateHandler.js";

var html = '';
const carHelper = {};

carHelper.buildCarListInScreen = function (carsList) {
    for (let car of carsList) {
        buildCarLine(car);
    }
    showCarSnippetInScreen();
}

carHelper.buildModalEditCar = function(carDetail, categoryTypeList, brandList){
    console.log(carDetail);
    console.log(categoryTypeList);
    console.log(brandList);
}

carHelper.showModalEditCar = function(){
    console.log("Mostrando o Modal");
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
    html += "<a href=\"#\" class=\"edit\" onclick=\"app.editCar("+ car.id +")\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>";
    html += "<a href=\"#\" class=\"delete\" id=\"deleteCar\" onclick=\"app.deleteCar("+ car.id +")\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>";
    html += "</td>";
    html += "</tr>";
}

function showCarSnippetInScreen() {
    $("#main-content-place-car-list").append(html);
}

export default carHelper;