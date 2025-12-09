# 🎵 Sistema de Cadastro e Gerenciamento de Músicas

Este projeto foi desenvolvido por **Igor Gabriel Daré Grubisich** e **Guilherme Henrique de Sousa**, sob orientação do professor **Nicollas**.  
O objetivo é fornecer um sistema completo para cadastro e administração de músicas, bandas, gêneros musicais e usuários, além de permitir que músicas possam ser favoritadas. 
O projeto foi construído utilizando **Java**, **JSF** e **Java DB**, aplicando o padrão **Repository** para acesso a dados.

---

## 🧩 Funcionalidades

### 🎶 Músicas
- Cadastrar novas músicas  
- Editar informações de músicas existentes  
- Visualizar informações de cada música  
- Listagem completa de músicas registradas  
- Favoritar músicas

### 🎸 Bandas
- Cadastrar bandas  
- Editar informações  
- Visualizar banda individual  
- Listar todas as bandas  

### 🎼 Gêneros Musicais
- Cadastro de novos gêneros  
- Edição de gêneros existentes  
- Visualização individual  
- Listagem completa

### 👤 Usuários
- Cadastro de novos usuários  
- Edição de perfil  
- Visualização de informações  
- Gerenciamento de músicas favoritas  

---

## 🗂 Arquitetura

O projeto segue o **padrão de projeto Repository**, garantindo:

- Separação entre lógica de negócio e acesso a dados  
- Facilidade de manutenção e evolução  
- Organização em camadas (entidades, serviços, repositórios, beans e páginas JSF)

As telas foram desenvolvidas em **XHTML**, integradas com beans gerenciados.

---

## 🛢 Banco de Dados

O sistema utiliza **Java DB (Apache Derby)** como solução de armazenamento.  
As principais tabelas/entidades armazenadas são:

- Música  
- Banda  
- Gênero Musical  
- Usuário  
