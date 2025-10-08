public class Computador{
    
    Processador processador = new Processador();
    HD hd = new HD();
    PlacaMae placamae = new PlacaMae();
    PlacaRede placarede = new PlacaRede();
    PlacaVideo placavideo = new PlacaVideo();
    Fonte fonte = new Fonte();

   public Computador(){
       
       // Config do processador:
       
       processador.setVelocidade(15);
       processador.setModelo("Seila");
       
       // Config do HD:
       
       hd.setCapacidade(512);
       
       // Config da Placa Mãe:
       
       placamae.setModelo("Naosei");
       
       // Config da Placa de Rede:
       
       placarede.setVelocidade(17);
       
       // Config da Placa de Vídeo:
       
       placavideo.setVelocidadeProcessador(18);
       placavideo.setModelo("...");
       placavideo.setMemoria(110);
       
       // Config da Fonte
       
       fonte.setPotencia(100);
       
   }
    
    public void imprimir(){
        System.out.println("Configurações:\nProcessador = " + processador.getProcessador() + "\nHD = " + hd.getHD() + "\nPlaca Mãe = " + placamae.getPlacaMae() + "\nPlaca de rede = " + placarede.getPlacaRede() + "\nPlaca de vídeo = " + placavideo.getPlacaVideo() + "\nFonte = " + fonte.getFonte());
    }
}