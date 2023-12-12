function cadastrarJogo() {
    const nome = document.getElementById('nome').value;
    const genero = document.getElementById('genero').value;
    const descricao = document.getElementById('descricao').value;
    const intsquad = document.getElementById('intsquad').value;
    const squad = document.getElementById('squad').value;
    let url = document.getElementById('url').value;
    let thumbnail = document.getElementById('thumbnailpath').value;

    // Remover o prefixo "http://"
    url = url.replace(/^https?:\/\//, '');
    thumbnail = thumbnail.replace(/^https?:\/\//, '');
    const requestBody = {
        nome,
        genero,
        descricao,
        intsquad,
        squad,
        url,
        thumbnail
    };

    fetch('http://localhost:8080/jogo/create', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(requestBody),
    })
        .then(response => response.json())
        .then(data => {
            alert('Jogo cadastrado com sucesso!');
            document.getElementById('cadastroForm').reset();
             location.reload();
        })
        .catch(error => {
            console.error('Erro ao cadastrar jogo:', error);
        });
}

function ListarJogos() {
    fetch(`http://localhost:8080/jogo`)
        .then(response => {
            if (response.status === 404) {
                return Promise.reject('Lista de Jogos não encontrada');
            }
            return response.json();
        })
        .then(data => {

            const tbodyElement = document.getElementById('jogos-tabela').querySelector('tbody');
            tbodyElement.innerHTML = '';

            // Preenche a tabela com os resultados da pesquisa
            data.forEach(jogo => {
                const linhaJogo = document.createElement('tr');
                linhaJogo.innerHTML = `
                    <td>${jogo.id}</td>
                    <td>${jogo.nome}</td>
                    <td>${jogo.descricao}</td>
                    <td>${jogo.intsquad}</td>
                    <td>${jogo.genero}</td>
                    <td>${jogo.url}</td>
                    <td><a href="https://${jogo.thumbnail}">Acesse a imagem</a></td>
                `;
                tbodyElement.appendChild(linhaJogo);
            });  
        })
        // Trata os Erros
        .catch(error => {
            console.error('Erro ao pesquisar funcionário:', error);
            const resultadoPesquisa = document.getElementById('resultadoPesquisa');
            resultadoPesquisa.innerHTML = 'Jopo não encontrado.';
        });
}