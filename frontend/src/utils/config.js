 const config = {
     actions: {
         autenticacao: "&a=AcessoSC&acao=",
         webServiceSite: "&a=SiteHome&acao=",
         cartaoCredito: "&a=CartaoCredito&acao=",
     },
     links: {
         urlBackend: 'https://www6.publicacoesonline.com.br/index.php?m=site_api&u=.',
         loginExportacao: 'https://publicacoesonline.com.br/index.php?m=exportacao&u=main&a=Index&acao=',
         urlBackendDev: 'http://127.0.0.1/pol-site-backend/index.php?m=site_api&u=.',
         loginExportacaoDev: 'http://jean.dev.publicacoesonline.com.br/infodigi_site/index.php?m=exportacao&u=main&a=Index&acao='         
     },

     idTiposProdutos: {
         intJur: 1,
         movimentacao: 2,
         distribuicao: 3,
         intAdm: 5,
         integraPromad: 11,
         inpi: 14,
         procEletronico: 16,
         pesqProcessosJud: 17,
         pesqProcessosAdm: 18,
         higienizacao: 19,
         mktJuridico: 49,
         levantamentoProc: 82,
         exportacao: 87,
     },
     arrayEstados: {
         AC: 'Acre',
         AL: 'Alagoas',
         AP: 'Amapá',
         AM: 'Amazonas',
         BA: 'Bahia',
         BR: 'Brasília',
         CE: 'Ceará',
         DF: 'Distrito Federal',
         ES: 'Espírito Santo',
         GO: 'Goiás',
         MA: 'Maranhão',
         MT: 'Mato Grosso',
         MS: 'Mato Grosso do Sul',
         MG: 'Minas Gerais',
         PA: 'Pará',
         PB: 'Paraíba',
         PR: 'Paraná',
         PE: 'Pernambuco',
         PI: 'Piauí',
         RJ: 'Rio de Janeiro',
         RN: 'Rio Grande do Norte',
         RS: 'Rio Grande do Sul',
         RO: 'Rondônia',
         RR: 'Roraima',
         SC: 'Santa Catarina',
         SP: 'São Paulo',
         SE: 'Sergipe',
         TO: 'Tocantins',
        }
 };

if (location.hostname === "localhost" || location.hostname === "127.0.0.1"){
    config.amb = 'dev';
}

 export default config;