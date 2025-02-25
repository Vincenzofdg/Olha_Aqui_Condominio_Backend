module.exports = {
  apps: [
    {
      name: "olha_aqui_condominio",
      script: "java",
      args: "-jar target/olhaaquicondominio-0.0.1-SNAPSHOT.jar",
      instances: 1,
      autorestart: true,
      watch: false,
      max_memory_restart: "1G",
    },
  ],
};
