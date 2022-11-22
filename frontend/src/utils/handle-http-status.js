import {sendMenssage} from '../utils/alerts.js';

export function handleHttpStatus(httpStatus, msg) {
    if(httpStatus !== 200){
        sendMenssage("error", msg);
    }
    if(httpStatus === 0){
        sendMenssage("error", "Something went wrong");
    }
}