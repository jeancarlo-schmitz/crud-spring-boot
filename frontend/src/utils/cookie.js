import Cookies from 'js-cookie'


export function CreateCookie(name, days, value) {
    Cookies.set(name, value, { expires: days })
}
export function VisualizarTodosCookies(){
    return Cookies.get();
}
export function DeleteAllCookie() {
    Object.keys(Cookies.get()).forEach(function(cookieName) {
        // console.warn('Removendo Cookie' + cookieName);
        Cookies.remove(cookieName);
      });
}
export function GetHash(){
    var cookie = Cookies.get();
    return cookie.hash;
}