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

Um Personal Access Token (PAT) é um token de autenticação utilizado como credencial para acessar recursos do GitHub, substituindo o uso da senha em ações realizadas pela linha de comando com Git, como `git clone`, `git push` e `git pull`.
Desde 13 de agosto de 2021, o GitHub não permite a autenticação por senha para operações Git. Desta forma, a criação de um PAT é necessária para validar a identidade do usuário e autorizar o acesso aos repositórios conforme as permissões configuradas.
A seguir, são descritos os passos para a geração de um Personal Access Token (PAT) no GitHub:

1. Acesse a conta do GitHub e clique na foto de perfil localizada no canto superior direito.
2. Selecione a opção **Settings**
3. No menu lateral, acesse **Developer Settings**
4. Cliqu em **Personal access tokens** e escolha "*Tokens (classic)*" ou "*Fine-grained tokens*", conforme a necessidade.
5. Clique em **Generate new token**.
6. Informe um nome para identificar o token, defina a data de expiração e defina as permissões necessárias para o seu uso.
7. Clique em **Generate token**.
8. Copie o texto gerado e armazene-o de maneira segura, pois ele será exibido somente uma vez.

### Salvar em cache as credenciais do PAT

## Qual a diferença entre git merge e git rebase?