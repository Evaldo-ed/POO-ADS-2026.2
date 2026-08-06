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

O armazenamento em cache das credenciais de acesso ao GitHub, como o Personal Access Token (PAT), permite evitar a necessidade de repetidamente informar o token a cada operação realizada que exige autenticação, reduzindo interrupções causadas por solicitações frequentes de validação e proporcionando maior praticidade no fluxo de desenvolvimento ao manter o acesso temporariamente disponível sem expor o token em arquivos de configuração ou scripts. 

Como exemplo, para salvar as credenciais em cache por 1 hora (3600 segundos), o seguinte comando deve ser executado:

```bash
git config --global credential.helper 'cache --timeout=3600'
```

Após esta configuração, o Git armazenará as credenciais fornecidas durante a autenticação e as reutilizará pelo período de tempo definido em segundos.

## Qual a diferença entre git merge e git rebase?

Os comandos `git merge` e `git rebase` possuem o objetivo de integrar alterações de branches diferentes, porém realizam esta função de maneiras distintas.

O `git merge` combina o histórico das branches selecionadas e cria um novo commit de merge, preservando a sequência original dos commits de cada branch, o que torna o histórico mais representativo ao processo de desenvolvimento. Portanto, é considerado a opção mais adequada quando é importante manter o registro completo das etapas de um projeto.

Em contraste, o `git rebase` reogarniza os commits de uma determinada branch, ordenando-os como se tivessem sido criados a partir da versão mais recente de outra branch, o que resulta em um histórico linear, sem commits adicionais de merge. Devido a estas características, é comumente utilizado para atualizar branches de desenvolvimento antes da integração ao branch principal, facilitando a leitura do histórico.

Deste modo, o `git merge` é mais apropriado para integrar branches públicas ou compartilhadas, uma vez que não modifica o histórico existente. Por sua vez, o `git rebase` é recomendado para organizar o histórico local e tornar a sequência de commits mais simples, mas deve ser aplicado com extremo cuidado, pois altera a identidade dos commits existentes e pode causar conflitos caso a branch esteja sendo utizlizada por múltiplos colaboradores. Em suma, `git merge` deve ser usado quando a preservação do histórico for prioridade, enquanto `git rebase` é mais adequado quando a clareza e linearidade do histórico forem mais importantes.
