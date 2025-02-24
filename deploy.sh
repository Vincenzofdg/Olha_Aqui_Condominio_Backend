#!/bin/bash

cd /caminho/do/repositorio

# 2. Atualiza o repositório
git fetch origin jar-build
git checkout jar-build
git pull origin jar-build

# 3. Para a aplicação rodando no PM2
pm2 stop app || true

# 4. Roda a aplicação novamente
java -jar *.jar &

# 5. Monitora com PM2
pm2 start --name minha-api "java -jar *.jar"

echo "🚀 Deploy atualizado com sucesso!"