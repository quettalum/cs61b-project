public class ParticleSimulator {
    public Particle[][] particles;
    public int width;
    public int height;

    public ParticleSimulator(int w, int h)
    {
        this.width = w;
        this.height = h;
        this.particles = new Particle[w][h];

        for (int x = 0; x < w; x++)
        {
            for (int y = 0; y < h; y++)
            {
                particles[x][y] = new Particle(ParticleFlavor.EMPTY);
            }
        }
    }
}