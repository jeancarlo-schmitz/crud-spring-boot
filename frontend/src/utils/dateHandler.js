const dateHandler = {};

dateHandler.adjustDateHourForBrazilView = function(dateToFormat){
    let date = new Date(dateToFormat);

    if(!isDateValid(date)){
        return '';
    }

    let day = date.getDay();
    let month = date.getMonth();
    let year = date.getFullYear();
    let hour = date.getHours();
    let minutes = date.getMinutes();
    let seconds = date.getSeconds();

    return day + "/" + month + "/" + year + " " + hour + ":" + minutes + ":" + seconds;
}

dateHandler.adjustDateForBrazilView = function(dateToFormat){
    let date = new Date(dateToFormat);

    if(!isDateValid(date)){
        return '';
    }
    
    let day = date.getDay();
    let month = date.getMonth();
    let year = date.getFullYear();

    return day + "/" + month + "/" + year;
}

function isDateValid(date){
    return date != undefined && date != '' && date != "Invalid Date" && date instanceof Date && !isNaN(date);
}

export default dateHandler;