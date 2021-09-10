package com.example.demo;

import com.example.demo.models.Foundation;
import com.example.demo.models.Purpose;
import com.example.demo.repositories.FoundationRepository;
import com.example.demo.repositories.PayeeRepository;
import com.example.demo.repositories.PurposeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    PurposeRepository purposeRepo;

    @Resource
    FoundationRepository foundationRepo;

    @Resource
    PayeeRepository payeeRepo;

    @Override
    public void run(String... args) throws Exception {

//        Purpose exercise = new Purpose("Exercise");
//        Purpose speakerSeries = new Purpose("Speaker Series");
//        Purpose distanceLearning = new Purpose("Distance Learning");
//        Purpose entertainment = new Purpose("Entertainment");
//        Purpose classical = new Purpose("Classical Music");
//        Purpose specialNeeds = new Purpose("Special Needs");
//        Purpose activities = new Purpose("Activities");
//        Purpose garden = new Purpose("Raised Bed Garden");
//        Purpose fathersDay = new Purpose("Father's Day");
//        Purpose outings = new Purpose("Outings");
//        Purpose interGen = new Purpose("Intergenerational Programs");
//        Purpose artStudio = new Purpose("Art Studio Supplies");
//        Purpose dreams = new Purpose("Dreams");
//        Purpose holidays = new Purpose("Jewish Holidays");
//        Purpose mensClub = new Purpose("Men's Club");
//        Purpose newYears = new Purpose("New Year's Eve Party");
//        Purpose rabbis = new Purpose("Reform or Conservative visiting rabbis");
//        Purpose mothersDay = new Purpose("Mother's Day");
//        Purpose eduLectures = new Purpose("Educational Lectures");
//        Purpose mitzvah = new Purpose("Mitzvah Corps");
//        Purpose athletic = new Purpose("Athletic Activities");
//        Purpose taiChi = new Purpose("Tai Chi/Pilates/Gigong");

//        purposeRepo.save(exercise);
//        purposeRepo.save(speakerSeries);
//        purposeRepo.save(distanceLearning);
//        purposeRepo.save(entertainment);
//        purposeRepo.save(classical);
//        purposeRepo.save(specialNeeds);
//        purposeRepo.save(activities);
//        purposeRepo.save(garden);
//        purposeRepo.save(fathersDay);
//        purposeRepo.save(outings);
//        purposeRepo.save(interGen);
//        purposeRepo.save(artStudio);
//        purposeRepo.save(dreams);
//        purposeRepo.save(holidays);
//        purposeRepo.save(mensClub);
//        purposeRepo.save(newYears);
//        purposeRepo.save(rabbis);
//        purposeRepo.save(mothersDay);
//        purposeRepo.save(eduLectures);
//        purposeRepo.save(mitzvah);
//        purposeRepo.save(athletic);
//        purposeRepo.save(taiChi);

//        Foundation mAndm = new Foundation("Marilyn & Marshall Bedol youth Special Needs", 42521, specialNeeds);
//        Foundation rayeMorris = new Foundation("Raye & Morris Blane Activities Fund", 29937, activities);
//        Foundation albertBilstein = new Foundation("Albert Bilstein: Garden Fund for SG", 55778, garden);
//        Foundation helenHerb = new Foundation("Helen & Herb Brown", 56892, fathersDay);
//        Foundation mollyCharles = new Foundation("Mollie & Charles Goodman", 38706, outings );
//        Foundation barbaraGross = new Foundation("Barbara Gross", 70350, entertainment);
//        Foundation june = new Foundation("June Isquick", 29484, interGen);
//        Foundation barbaraStanley = new Foundation("Barbara & Stanley Meisel Art Studio Fund", 83119, artStudio);
//        Foundation hortense = new Foundation("Hortense Meyer Family Dreams Fund", 72699, dreams);
//        Foundation munitz = new Foundation("A Munitz- L & L Rich Family Jewish Holiday", 55073, holidays);
//        Foundation rena = new Foundation("Rena 'Mimmi' Reich Fund", 64133, entertainment);
//        Foundation larry = new Foundation("Larry Reiss Men's Club Fund", 47976, mensClub);
//        Foundation zelda = new Foundation("Morris- Zelda- Esther Rice", 31594, newYears);
//        Foundation sayre = new Foundation("Sayre Family Activities Fund", 212448, activities);
//        Foundation schnerb = new Foundation("Schnerb & Sokel Reform / Conservative", 59591, rabbis);
//        Foundation senkfor = new Foundation("Senkfor Family", 21442, interGen);
//        Foundation sheryl = new Foundation("Sheryl & Bart Simon", 47323, mothersDay);
//        Foundation carol = new Foundation("Carol P. and Irwin N. Sokol Edu. Fund", 214062, eduLectures);
//        Foundation sylvia = new Foundation("Sylvia Swerdlow Memorial Fund", 39301, eduLectures);
//        Foundation laya = new Foundation("Laya & Leonard Tanenbaum Good Times Fund", 74422, outings);
//        Foundation peggy = new Foundation("Peggy & Philip Wasserstrom Fund", 30659, classical);
//        Foundation esther = new Foundation("Esther G. & Joseph S. Weil En. Fund", 34672, entertainment);
//        Foundation weisz = new Foundation("Weisz Family Mitzvah Corps Fund", 29866, mitzvah);
//        Foundation estelle = new Foundation("Estelle & Allen Wolfe Fund", 14155, athletic);
//        Foundation peter = new Foundation("Peter Meisel", 250000, outings);
//        Foundation david = new Foundation("David and Helen Nagusky", 130000, taiChi);


//        foundationRepo.save(mAndm);
//        foundationRepo.save(rayeMorris);
//        foundationRepo.save(albertBilstein);
//        foundationRepo.save(helenHerb);
//        foundationRepo.save(mollyCharles);
//        foundationRepo.save(barbaraGross);
//        foundationRepo.save(barbaraStanley);
//        foundationRepo.save(hortense);
//        foundationRepo.save(munitz);
//        foundationRepo.save(june);
//        foundationRepo.save(rena);
//        foundationRepo.save(larry);
//        foundationRepo.save(zelda);
//        foundationRepo.save(sayre);
//        foundationRepo.save(schnerb);
//        foundationRepo.save(senkfor);
//        foundationRepo.save(sheryl);
//        foundationRepo.save(carol);
//        foundationRepo.save(sylvia);
//        foundationRepo.save(laya);
//        foundationRepo.save(peggy);
//        foundationRepo.save(esther);
//        foundationRepo.save(weisz);
//        foundationRepo.save(estelle);
//        foundationRepo.save(peter);
//        foundationRepo.save(david);

    }
}
