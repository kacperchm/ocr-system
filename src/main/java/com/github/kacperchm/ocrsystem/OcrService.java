package com.github.kacperchm.ocrsystem;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

@Service
public class OcrService {
    public String doOCR(String url) {
        try {
        URL imageFile = new URL(url);
        BufferedImage bufferedImage = ImageIO.read(imageFile);

        ITesseract instance = new Tesseract();

        instance.setDatapath("C:\\Users\\chmur\\Downloads");
        instance.setLanguage("pol");

            return instance.doOCR(bufferedImage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
