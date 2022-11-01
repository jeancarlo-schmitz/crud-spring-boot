export default function (ativaDesativa) {
    var loading = document.querySelector('#loading');
    if (loading !== null) {
        if (ativaDesativa === true) {
            loading.style.display = 'block';
        } else {
            loading.style.display = 'none';
        }
    }
}