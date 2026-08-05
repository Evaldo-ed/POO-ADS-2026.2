# Sistema de Controle de Versão

## Configuração Inicial para uso do Git

### Configuração de nome de usuário e e-mail no git

Para que seja possível fazer commits com Git, é necessário primeiro configurar o nome de usuário e o endereço de e-mail, uma vez que estas informações são registradas em cada commit para identificar a autoria dos mesmos. Caso não estejam configuradas, o Git irá impedir a criação de commits e solicitar que a configuração seja realizada antes de prosseguir.
A configuração de nome de usuário e e-mail pode ser efetuada com os seguintes comandos:

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu.email@exemplo.com"
```

Ademais, as informações podem ser definidas somente para o repositório atual ao remover a opção "-\- global":

```bash
git config user.name "Seu Nome"
git config user.email "seu.email@exemplo.com"
```

### Criando Personal Access Token (PAT) no GitHub

### Salvar em cache as credenciais do PAT

## Qual a diferença entre git merge e git rebase?