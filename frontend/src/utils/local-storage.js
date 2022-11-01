export function SetLocalStorage(nome, milisegundosTime, valor) {
    const dataAtual = new Date();
    var dataAtualAux = dataAtual.getTime() + milisegundosTime;
    //console.log('Data atual: ' + dataAtual.toLocaleString());
    //console.log('Data atual + milisegundos: ' + new Date(dataAtualAux).toLocaleString());

    const item = { valor, expirar:  + dataAtualAux }
    localStorage.setItem(nome, JSON.stringify(item))
}

export function GetLocalStorage(nome) {
    var valorItem = localStorage.getItem(nome);
    
    // Se o valor do item conter chaves é sinal que é uma str JSON, então retorna apenas o atributo "valor" JSON parseado
    if (valorItem && /^\{(.*?)\}$/.test(valorItem)) {
        var itemAtual = JSON.parse(valorItem);
        return itemAtual.valor;
    }

    // Caso contrário retorna o valor completo do item
    return valorItem;
}

export function GetAllLocalStorage() {
    let allLocalStorage = Object.entries(localStorage);
    let arrayRetorno = [];

    for (let item of allLocalStorage) {
        arrayRetorno[item[0]] = GetLocalStorage(item[0]);
    }

    return arrayRetorno;
}

export function DeleteAllLocalStorage() {
    localStorage.clear();
}

export function DeleteAllSessionStorage() {
    sessionStorage.clear();
}