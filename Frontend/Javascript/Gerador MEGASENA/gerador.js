const entrada = document.getElementById("entrada");
const saida = document.getElementById("saida");
var jogos = [];
var numeros = [];
var txtSaida = '';

function geraJogos() {
    let nJ = parseInt(entrada.value.split(" ")[0]);
    let nN = parseInt(entrada.value.split(" ")[1]);
    let nTemp = 0;
    jogos = [];
    saida.innerHTML = "";
    if ((nJ === 1 || nJ === 2) && (nN > 5) && (nN < 16)) {
        for (i = 0; i < nJ; i++) {
            for (j = 0; j < nN; j++) {
                while (numeros.indexOf(nTemp = Math.floor(Math.random() * 59 + 1)) >= 0);
                if (parseInt(nTemp) < 10) nTemp = "0" + nTemp;
                numeros.push(nTemp);
            }
            numeros = numeros.sort();
            jogos.push(numeros);
            numeros = [];
        }
        //Monta a saída na tela
        for (i = 0; i < jogos.length; i++) {
            let linha = document.createElement("label");
            linha.innerHTML = jogos[i];
            saida.appendChild(linha);
        }
        //Monta a saída em txt
        for (i = 0; i < jogos.length; i++) {
            txtSaida += "Jogo MEGASENA: ";
            let linha = jogos[i].toString();
            txtSaida += linha.replaceAll(",", " ");
            txtSaida += "\r\n";
        }

        let btSalvar = document.createElement("button");
        btSalvar.innerHTML = "Salvar em TXT";
        btSalvar.setAttribute("onclick", "salvarTXT()");
        saida.appendChild(btSalvar);
    } else {
        alert("Opção de bilhete inválida, cada bilhete aceita no máximo 2 jogos, de 6 a 15 números.");
    }
}

function salvarTXT() {
    let link = document.createElement("a");
    link.href = "data:," + txtSaida;
    link.download = "megasena_jogos.txt";
    link.click();
}

