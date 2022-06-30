/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50734
 Source Host           : localhost:3306
 Source Schema         : ayiy

 Target Server Type    : MySQL
 Target Server Version : 50734
 File Encoding         : 65001

 Date: 18/05/2022 17:24:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, '休闲');
INSERT INTO `category` VALUES (2, '体育');
INSERT INTO `category` VALUES (3, '冒险');
INSERT INTO `category` VALUES (4, '动作');
INSERT INTO `category` VALUES (5, '大型多人在线');
INSERT INTO `category` VALUES (6, '竞速');

-- ----------------------------
-- Table structure for game
-- ----------------------------
DROP TABLE IF EXISTS `game`;
CREATE TABLE `game`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  `platform_id` int(11) NULL DEFAULT NULL,
  `price` double NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pubdate` datetime(0) NOT NULL DEFAULT '2019-01-01 08:08:08',
  `src` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `details` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `name`(`name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 93 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of game
-- ----------------------------
INSERT INTO `game` VALUES (1, '饥荒', 1, 1, 100, '饥荒', '2022-03-08 16:00:00', 'game1_jh.jpg', '《饥荒》是由Klei Entertainment开发的一款动作冒险类求生游戏，于2013年4月23日在PC上发行，2015年7月9日在iOS发布口袋版。 [1] 游戏讲述的是关于一名科学家被恶魔传送到了一个神秘的世界，玩家将在这个异世界生存并逃出这个异世界的故事。');
INSERT INTO `game` VALUES (2, '歧路旅人', 1, 1, 20, '歧路旅人', '1970-01-01 00:00:00', 'game1_qllr.jpg', '《歧路旅人》（八方旅人）是由Square Enix（史克威尔·艾尼克斯）和ACQUIRE开发的电子角色扮演游戏，游戏的故事发生在奥鲁斯特拉大陆，玩家需要扮演出身迥异，各怀绝技而又各有所求的八名旅人中其中一人，踏上他/她的旅途。 [1] NS游戏《八方旅人》截止2019年3月7日出货量突破150万份。 [2] 游戏于2018年7月13日在任天堂Switch平台发行 [1] ，2019年6月8日在Steam平台发行。八位旅行者的八次冒险之旅。化身为八个角色之一，踏上史诗般的旅程，穿越广阔而神奇的奥鲁斯特拉大陆，探索八位旅行者各自迷人的故事。');
INSERT INTO `game` VALUES (3, '使命召唤：黑色行动', 1, 1, 200, '使命召唤', '1969-12-31 16:00:00', 'game7_smzh3hsxd.jpg', '《使命召唤：黑色行动》（Call of Duty: Black Ops）是由Treyarch工作室研发的一款第一人称射击游戏，为动视FPS游戏使命召唤系列的第七部作品。 [1] 该作于2010年11月9日正式发行，登陆PC、Xbox 360、PS3、Wii等平台。 [2] 游戏背景为冷战时期，玩家将扮演一名精英特种部队SOG的士兵，进入包括苏联境内、乌拉尔山以及越南等冷战时期的冲突地带，深入敌后进行秘密行动，在没有任何援兵的情况下完成所有的任务。 ');
INSERT INTO `game` VALUES (4, '鬼泣3', 1, 1, 300, '鬼泣3', '2016-12-31 16:00:00', 'game4_gq3.jpg', '《鬼泣3》由CAPCOM制作的一款动作冒险类游戏。于2005年3月1日发行。 《鬼泣2》发售后，由于口碑未如理想，CAPCOM决定以回归《鬼泣》为重点，开发系列续作《鬼泣3》。《鬼泣3》于2005年3月1日在PlayStation 2发售，取得极高的评价，重新将“鬼泣系列”推上高峰。 本代的故事剧情拉回一代之前，叙述刚成立恶魔猎人事务所的但丁（Dante），在神秘男子带来口信后，展开了与众多入侵恶魔的对决，与但丁为双胞胎兄弟关系的维吉尔（Vergil），也将以敌对的身分登场，展开一场西洋双手剑对日本武士刀的华丽对决。 [1] ');
INSERT INTO `game` VALUES (5, '鬼泣4', 1, 1, 300, '鬼泣4', '2016-12-31 16:00:00', 'game4_gq4.jpg', '《鬼泣4》是由日本CAPCOM开发的一款动作冒险游戏，是《鬼泣》系列的第四部作品，于2008年1月31日发行。\r\n该游戏的剧情发生在《鬼泣2》之后与《鬼泣5》之前，玩家将跟随主角尼禄经历冒险并揭露教皇的阴谋.在一座几乎与世隔绝的岛屿上，“弗杜那”都市（Fortuna）的信仰组织魔剑教团，崇拜挺身为人类对抗魔界大军的斯巴达，憎恨斯巴达之外的恶魔，以排除其他恶魔为第一教义。\r\n主角尼禄是“教团骑士”成员之一，是一个对斯巴达信仰极不热情的少年。有着令人刮目相看的实力，但非常不喜欢与别人合作，宁愿单独完成教团派给他的“肮脏的工作”。\r\n有一日，魔剑教团的祭典进行之时，突然一名红衣男子刺杀了教皇，尼禄与他展开战斗，最后成功击退。教团骑士团长克雷多命令尼禄去寻找这位刺客，然而当尼禄离开教堂后却发觉弗杜那已经被恶魔侵占，究竟红衣男子的目的是什么。');
INSERT INTO `game` VALUES (6, '刺客信条·起源', 1, 1, 360, '刺客信条·起源', '2016-12-31 16:00:00', 'game4_ckxt12.jpg', '《刺客信条：起源》（Assassin\'s Creed Origins [1]  ）是一部由育碧蒙特利尔工作室开发、育碧发行的动作冒险游戏。本作是《刺客信条》主系列的第七部作品，也是系列首次把时间线推前到刺客信条初代以前。 [2] \r\n游戏背景设定于托勒密王朝埃及艳后统治下的埃及，玩家所操控的角色是一位隶属于法老的护卫，称为守护者，是一名来自锡瓦名为巴耶克的埃及刺客。 [3] \r\n该作于2017年10月27日正式发售，登陆PC、PS4、Xbox One等平台，游戏同时登陆于2017年11月7日发售的全新主机Xbox One X。刺客信条：起源》是由育碧制作并发行的《刺客信条》系列历史上规模最大的一个。本作采用开放地图沙盒玩法，主地图为埃及，聚焦刺客兄弟会的起源，主角为巴耶克。\r\n游戏除了埃及之外，还可以通过航船系统探索其他国家，比如希腊，以及整个地中海地区，海战依然会出现在本作中，毕竟该作由《刺客信条：黑旗》团队打造。\r\n本作自由度很高，相较系列前作更注重探索，并且还采用了非线性架构，设计了角色成长系统，而且和剧情联系度不深，有兴趣的玩家可以来尝试一下。');
INSERT INTO `game` VALUES (7, '人类一败涂地', 1, 2, 20, '人类一败涂地', '2017-01-01 08:08:08', 'game1_rlybtd.jpg', '《人类：一败涂地（Human: Fall Flat）》是一款快节奏开放结局物理模拟第三人称解谜探索游戏。\r\n2017年十月推出NS版《人类：一败涂地》。《人类：一败涂地（Human: Fall Flat） [2]  》是一款快节奏开放结局物理模拟第三人称解谜探索游戏 [3]  ，游戏设置在奇幻漂浮的梦境世界中，玩家的目标是要通过一系列解谜来逃离不断崩塌的梦境，一切仅靠着玩家的智慧和知识。《人类：一败涂地》这个游戏的魅力在于和《模拟山羊》、《我是面包》那样，从内里就将喜剧作为基础，为的就是能够博人一笑。而游戏中人物那魔性的动作，真的是怼墙、怼车、怼空气，任何精确地操作都是无法实现的，但是这些滑稽的失败也是游戏的乐趣所在。');
INSERT INTO `game` VALUES (8, '刺客信条', 4, 2, 200, '刺客信条', '2017-01-01 08:08:08', 'game4_ckxt.jpg', '《刺客信条》是由育碧蒙特利尔工作室研发的动作冒险类游戏系列，主要角色有阿泰尔、康纳、艾吉奥，于2007年发行第一部，游戏平台为PS3、PC和PSP。 [1] \r\n该游戏系列是以超高的自由度和精美的画面作为最大卖点的动作类游戏。玩家将在每部游戏中控制一名刺客，通过在任务中巧妙穿插重要的历史人物及历史事件带给玩家深沉的代入感。《刺客信条》（Assassin\'s Creed [3]  ）的故事设定在欧洲中古黑暗的第三次十字军东征时期，游戏舞台穿梭于大马士革、耶路撒冷等中东历史名城之间，当时的统治者以高压方式统治人民诛杀异己，百姓苦不堪言，玩家扮演的是一位身怀绝艺的白衣刺客阿泰尔，以来无影去无踪的高超杀人技巧，专门刺杀残暴的统治阶层，而铲奸除恶也成为玩家信守的“刺客信条”，为救无辜百姓而努力。');
INSERT INTO `game` VALUES (9, '鬼泣5', 1, 1, 200, '鬼泣5', '2018-12-31 16:00:00', 'game4_gq5.jpg', '《鬼泣5》是由日本CAPCOM开发的一款动作冒险游戏，该作是《鬼泣》系列第六部，且是《鬼泣4》的正统续作，故事发生在《鬼泣4》之后，于2019年3月8日发售，登陆PC、PS4和XBOX One平台 [1-3]  。\r\n游戏剧情设定为城市出现大批恶魔，玩家需要扮演游戏角色参与对抗 [4]  。游戏采用Capcom内部专有的RE引擎开发，使得游戏在图形保真度方面达到了全新的高度《鬼泣5》的剧情设定在《鬼泣4》的故事之后，但丁和尼禄两大主角回归，还加入了神秘的新角色“V”。\r\n城市中央一棵巨树冲天而起，市民们纷纷聚来围观，惊诧不已。\r\n鬼泣5情报\r\n鬼泣5情报\r\n“情报商”莫里森望着巨树暗自祈祷：“我们认识这么久……这样的大麻烦还是第一次。这次你也要好好挺过去啊，但丁。”\r\n这边但丁的确遇到了大麻烦，面对空前强大的恶魔，连这个久经沙场的传奇恶魔猎人都束手无策。\r\n此时尼禄也赶来援助但丁。\r\n神秘人V告诉尼禄，千万不要低估这个恶魔，就是它夺走了尼禄的右臂，并从中获得了超凡的力量 [4]  ');
INSERT INTO `game` VALUES (10, '控制', 4, 1, 200, '控制', '2019-01-01 08:08:08', 'game4_kz.jpg', '游戏的主要场景就发生在美国联邦政府下的控制局中，一座庞大且可以不断变换形态的建筑。游戏简单的故事背景是，这个控制局已经被超自然力量腐蚀，玩家扮演的女主杰西·法登需要去调查这个奇异事件。');
INSERT INTO `game` VALUES (11, '虐杀原形', 4, 2, 200, '虐杀原形', '2019-01-01 08:08:08', 'game4_nsyx.jpg', '虐杀原形（Prototype）是一款开放式科幻类动作冒险游戏，由Activision公司于2009年6月9日发行。\r\n游戏设定在现代的纽约，游戏的主角是一个漫画式的反英雄角色——Alex Mercer，感染了病毒的游戏主角，一次醒来之后发现完全不知道之前做了些什么。玩家需要利用主角的各种超能力来寻找他的过去。在Radical开发的这款科幻游戏中，玩家将扮演一位基因突变的变身人，伴随着破坏穿梭在曼哈顿城中。一路上，玩家们不但要弄清自己身份以及超能力背后隐藏的秘密，还要与军队和各种变异敌人战斗。\r\n游戏视频网站Gametrailers收录的开放性世界动作游戏《虐杀原形》的视频的观看次数超越了一千万次，特别授予《虐杀原形》钻石荣誉称号。');
INSERT INTO `game` VALUES (12, '绝地求生大逃杀', 5, 1, 98, '绝地求生', '2019-01-01 08:08:08', 'game5_jdqs.jpg', '《绝地求生》(PUBG) 是由蓝洞开发的一款战术竞技型射击类沙盒游戏 [1]  。\r\n在该游戏中，玩家需要在游戏地图上收集各种资源，并在不断缩小的安全区域内对抗其他玩家，让自己生存到最后 [2]  。\r\n游戏《绝地求生》除获得G-STAR最高奖项总统奖以及其他五项大奖 [3]  ，还打破了7项吉尼斯纪录。\r\n2018年8月9日，《绝地求生》官方宣布，将开启“百日行动”，进行持续数月的自查运动，为玩家提供一个更好的游戏体验 [4]  ；11月，有超过200万个账户被冻结 [5]  。该 游戏于2018年12月7日登陆PS4平台。这座岛名字叫做Erangel，在游戏中，Erangel是位于克里米亚\r\n的一个小岛，在二战之后被苏联占领，占领之后，苏联人把这座岛从所有的地图中抹去，并将它打造成一个秘密研究基地，还在当地人身上进行生物和化学实验。随后这座岛被遗弃，因为一群反抗军炸掉了几个生物研究所，导致所有人都撤离了这座岛。\r\n游戏有多张地图可供玩家选择，每一局游戏有100名玩家参与，玩家空投跳伞至地图的各个角落，赤手空拳寻找武器，车辆以及物资，并在多种多样的地形中展开战斗。想要取得胜利，策略与枪法同样重要。在游戏过程中，会有一个蓝色的圈驱逐玩家到一个较小的地方交火。这个蓝圈俗称为 “电圈“或者“毒圈”--“毒圈”的称呼来自于同类型游戏H1Z1 里缩小的氯气毒圈，开发者说这是由某种电力发射器释放的某种电场，本来是用于镇压Erangel当地人的反抗行动的。游戏的每一局比赛都会随机转换安全区，并且每个区域获得的武器、道具均是随机出现。');
INSERT INTO `game` VALUES (13, '极品飞车', 6, 1, 200, '极品飞车', '2019-01-01 08:08:08', 'game6_jpfc.jpg', '影片《极品飞车》根据同名热门单机游戏改编，由斯科特·沃夫执导，约翰·盖汀斯、乔治·加顿斯担任编剧，亚伦·保尔、伊莫琴·普茨、迈克尔·基顿等主演。影片于2014年3月14日在美国上映。影片讲述主角托比·马歇尔在一次地下赛车时遭陷害入狱，好友也在事故中丧生。出狱后托比决定报仇雪恨，逐步踏上一场复仇之旅的故事。');
INSERT INTO `game` VALUES (14, '怪物猎人世界', 7, 1, 200, '怪物猎人', '2019-01-01 08:08:08', 'game7_gwlr.jpg', '《怪物猎人：世界》（モンスターハンターワールド）是卡普空采用MT Framework引擎开发制作达四年之久的第三人称角色扮演类动作游戏 [1]  。\r\n2018年8月13日，腾讯Wegame发布公告，称“因WeGame平台发行的该作部分游戏内容未完全符合政策法规要求”，相关政府管理部门接到大量举报，该游戏相应运营资质文件现在已被取消。应主管部门要求，现执行下架整改，停止游戏售卖。怪物猎人：世界》是由CAPCOM制作发行的一款动作冒险游戏，在全球范围内都享有盛赞，本代怪物猎人发生了诸多进化，玩法与画面都有非常巨大的进步，游戏最多支持16人联机集会所，4人联机狩猎。 [7]  在游戏中玩家将扮演一位第五期团的推荐组猎人，探索新大陆的深处，解开古龙迁徙的秘密。猎人们必须利用他们的聪明才智和个人能力才能在激烈、变化多端的战斗中存活下来，并且最终成为“指引明路的苍蓝星”。 [8] \r\nCapcom于北京时间12月10日晚22:00放送了《怪物猎人世界》的特别节目，节目中发表了《怪物猎人世界》的超大型DLC扩展内容《怪物猎人世界：ICEBORNE》，新增内容包含新的任务等级、动作、地区、魔物和武器防具，而剧情将会接着《怪物猎人世界》的结局发展更丰富的故事，也就是相当于“G”系列的内容。');
INSERT INTO `game` VALUES (15, '看门狗', 7, 1, 200, '看门狗', '2019-01-01 08:08:08', 'game7_kmg.jpg', '《看门狗》是育碧2013年的3A级重磅大作（由于育碧对游戏的优化与打磨而延期至2014年），本作采用开放世界的沙盒玩法，游戏讲述了一个十分精彩的故事，该游戏采用了新的AnvilNext引擎，打造出了一个辽阔庞大的世界，这个开放世界的冒险游戏发生在芝加哥，那时的电子设备已经被内置于几乎所有物品中，整个城市都在依赖着他们。玩家要扮演Aiden Pearce，这是一位精通黑客技术的高手，于是他决定利用自己的特长来惩治全城的腐败分子，惩奸除恶。游戏以极高的自由度、出色的游戏质量与丰富的游戏内容被业界公认为开启次世代游戏的大门之作，该游戏被IGN评为年度最佳射击游戏 [1]  。《看门狗》英文版于2014年5月27日发售，中文版于6月25日发售。《看门狗》的WiiU版于2014年11月18日登陆北美，11月20日登陆欧洲，本作WiiU版的容量大小约为17.7GB。');
INSERT INTO `game` VALUES (16, '愤怒的小鸟', 1, 1, 200, '愤怒的小鸟', '2019-01-01 08:08:08', 'game1_fndxn.jpg', '《愤怒的小鸟》是由Rovio开发的一款休闲益智类游戏，于2009年12月首发于iOS。 [1] \r\n游戏以小鸟报复偷走鸟蛋的肥猪为背景，讲述了小鸟与肥猪的一系列故事。\r\n2016年3月18日，联合国前秘书长潘基文任命该游戏中的红色小鸟为绿色荣誉大使。 [2]  并于同年被改编成同名电影《愤怒的小鸟》。为了报复偷走鸟蛋的肥猪们，鸟儿以自己的身体为武器，仿佛炮弹一样去攻击肥猪们的堡垒。愤怒的红色小鸟，奋不顾身的往绿色的肥猪的堡垒砸去。游戏的玩法很简单，将弹弓上的小鸟弹出去，砸到绿色的肥猪，将肥猪全部砸到就能过关。鸟儿的弹出角度和力度由玩家的手指来控制，要注意考虑好力度和角度的综合计算，这样才能更准确的砸到肥猪。而被弹出的鸟儿会留下弹射轨迹，可供参考角度和力度的调整。另外每个关卡的分数越多，评价将会越高 [4]');
INSERT INTO `game` VALUES (17, '植物大战僵尸', 1, 1, 200, '植物大战僵尸', '2019-01-01 08:08:08', 'game1_zwdzjs.jpg', '《植物大战僵尸》是由PopCap Games开发的一款益智策略类单机游戏，于2009年5月5日发售。\r\n玩家通过武装多种植物切换不同的功能，快速有效地把僵尸阻挡在入侵的道路上。不同的敌人，不同的玩法构成五种不同的游戏模式，加之黑夜、浓雾以及泳池之类的障碍增加了游戏挑战性。\r\n该作在PC上同时有普通版、年度版、Adobe Flash动画缩减版及正在公测的人人网社区版等多个版本。《植物大战僵尸》是一款极富策略性的小游戏。可怕的僵尸即将入侵，每种僵尸都有不同的特点，例如铁桶僵尸拥有极强的抗击打能力，矿工僵尸可以挖地道绕过种植在土壤表面的植物等。玩家防御僵尸的方式就是栽种植物。49种植物每种都有不同的功能，例如樱桃炸弹可以和周围一定范围内的所有僵尸同归于尽，而食人花可以吃掉最靠近自己的一只僵尸。玩家可以针对不同僵尸的弱点来合理地种植植物，这也是胜利的诀窍。游戏根据玩法不同分为五种游戏模式：冒险、生存、花瓶破碎者、小游戏、花园。加之黑夜、屋顶、浓雾以及泳池之类的障碍增加了其挑战性该游戏近乎永无止境');
INSERT INTO `game` VALUES (18, '球球大作战', 1, 1, 200, '球球大作战', '2019-01-01 08:08:08', 'game1_qqdzz.jpg', '球球大作战》是一款由巨人网络Superpop&Lollipop工作室自主研发，并且免费（不包括道具）的手机网络游戏。2015年5月27日由巨人网络在中国大陆发行。 [1] \r\n游戏以玩家间的实时互动PK为设计宗旨，通过简单的规则将玩家操作直接转化为游戏策略，体验智谋碰撞的战斗乐趣。在这个球球的世界里，每个人都化身为一颗独特的球球，大球吃小球，努力生存下来就是唯一的目标。 [2] \r\n2016年7月30日，《球球大作战》获得2016星耀360游戏“年度十大人气移动游戏奖”。 [3]  2016年9月，《球球大作战》正式列入CEST首个移动电竞项目。 [4]  2016年11月，《球球大作战》荣登2016中国泛娱乐指数盛典“中国IP价值榜-游戏榜top10”。');
INSERT INTO `game` VALUES (19, '桥梁构造者', 1, 1, 200, '桥梁构造者', '2019-01-01 08:08:08', 'game1_qlgzz.jpg', 'lopeMania 会将您带到由三个全新的岛屿组成的 Tiltin 群岛上。您可以进入岛上色彩斑斓的洞穴，在里面建造桥梁。\r\n在 24 个前所未有的新关卡中，你可以修建斜道以战胜巨大的高差。\r\n“疯狂关卡”难度非常高，您需要动脑筋想出好点子和与众不同的方案才能过关。在 Bridge Constructor 中，您必须成为一名熟练的桥梁建筑师。共计有 40 个不同的关卡，可以在深谷、沟\r\n游戏截图\r\n游戏截图(5张)\r\n渠或河流上修建桥梁。压力测试可以证明您所修建的桥梁是否能承受每天汽车和卡车的连续碾压。\r\n您可以为每一段桥梁选择不同的材料，例如木头、钢筋、钢索或混凝土支柱。 使用合适的材料并保证不超出预算，才能修建一座完美的桥梁。修建一座桥梁时，您可以随意搭配不同的建筑材料，这意味着修桥的方式多种多样 – 唯一的限制条件是您的预算。您还可以使用优化后的格点系统，建造一座高精度的完美桥梁。尽情发挥您的想象力和创造力吧！如果遇到难题，您可以在新帮助系统中寻找有价值的信息。');
INSERT INTO `game` VALUES (20, '水果忍者', 1, 1, 200, '水果忍者', '2019-01-01 08:08:08', 'game1_sgrz.jpg', '\r\n《水果忍者》（Fruit Ninja），是由澳大利亚公司Halfbrick Studios开发的一款休闲益智类游戏，于2010年4月20日在iOS平台推出。\r\n《水果忍者》这款游戏的创意来源也非常简单，就是一位员工在家里看到电视播放销售水果刀的广告，为了体现出刀的锋利，广告里推销员把香蕉抛向空中，然后用水果刀在空中把香蕉切开。\r\n\r\n《水果忍者》（Fruit Ninja），是由澳大利亚公司Halfbrick Studios开发的一款休闲益智类游戏，于2010年4月20日在iOS平台推出。\r\n《水果忍者》这款游戏的创意来源也非常简单，就是一位员工在家里看到电视播放销售水果刀的广告，为了体现出刀的锋利，广告里推销员把香蕉抛向空中，然后用水果刀在空中把香蕉切开。\r\n\r\n《水果忍者》（Fruit Ninja），是由澳大利亚公司Halfbrick Studios开发的一款休闲益智类游戏，于2010年4月20日在iOS平台推出。\r\n《水果忍者》这款游戏的创意来源也非常简单，就是一位员工在家里看到电视播放销售水果刀的广告，为了体现出刀的锋利，广告里推销员把香蕉抛向空中，然后用水果刀在空中把香蕉切开。\r\n');
INSERT INTO `game` VALUES (21, '节奏次元', 1, 1, 200, '节奏次元', '2019-01-01 08:08:08', 'game1_jjcy.jpg', '进入节奏次元。通过旋转，点击，轻弹和滑动全球最棒的节奏将颜色和节拍合在一起。');
INSERT INTO `game` VALUES (22, 'Imbroglio', 1, 1, 200, 'Imbroglio', '2019-01-01 08:08:08', 'game1_Imbroglio.jpg', '　Imbroglio是基于推箱子的解谜闯关游戏，7个不同的世界，7种主要机制，超过40个关卡。每个谜题都有自己的想法，有的可能令人恐惧，有的可能很有趣，有的甚至会背叛玩家。');
INSERT INTO `game` VALUES (23, 'NBA 2K游乐场2 ', 2, 2, 200, 'NBA 2K游乐场2 官方中文正式版', '2019-01-01 08:08:08', 'game2_NBA2K游乐场2.jpg', '《NBA 2K游乐场2》将会提升该系列一贯的俯视视角/2v2的街头运动体验，还提供全新在线阵容以及本地多人游戏模式，还有来自世界各地的新场景。 　　\r\n\r\n　　游戏中的游乐场锦标赛模式将会引入全新的全球排名联赛系统，包括经济solo和合作天梯模式。赛季模式则是全新的单人游戏体验，为玩家带来带领队伍在赛季中过关斩将的感觉，最后还有NBA锦标赛本身。另外游戏还通过专属服务器改善了比赛匹配特性，以及4人在线游戏、3点竞赛和自定义比赛等等。游戏还有相当完整的NBA现役退役知名球员。最后游戏的AI和玩家模型/动画也得到改善。');
INSERT INTO `game` VALUES (24, '实况足球2020', 2, 2, 200, '实况足球2020 中文版', '2019-01-01 08:08:08', 'game2_skzq.jpg', '《实况足球2020》是Konami制作发行《实况足球》系列的续作。');
INSERT INTO `game` VALUES (25, '孤山速降', 2, 1, 200, '孤山速降', '2019-01-01 08:08:08', 'game2_gssj.jpg', '　《孤山速降》是由Megagon Industries制作并发行的一款体育类游戏。本作的画面并不是写实风，但精美的卡通画面也非常迷人，尤其是搭配上布偶的物理系统，整个游戏的过程像是在操控一段动画片，更是多了一分美感。');
INSERT INTO `game` VALUES (26, '越野摩托2019', 2, 1, 200, '越野摩托2019', '2019-01-01 08:08:08', 'game2_yymt.jpg', 'Motocross 锦标赛的官方电玩游戏强势回归，并添加本系列游戏的多种全新功能！\r\n\r\n当前赛季\r\n　　2019 年 MXGP 和 MX2 锦标赛的车手、摩托车和队伍都已准备好在本赛季的官方比赛中与您一较高下，比赛将在世界各地举办。您可以体验内乌肯或上海等地刚结束的刺激赛事，或是探索全新的比赛。如果您不满意目前的级别，就努力晋升吧！\r\n\r\n　　游戏中具有动态天气功能，因此就如同现实中的赛车环境，您将面对变化多端的天候状况。不过，大雨过后总会放晴的，对吧？\r\n\r\n　　通过赞助商资助或受雇于官方队伍，参与 MXGP 和 MX2 锦标赛。\r\n\r\n赛道编辑器\r\n　　运用想象力，利用赛道编辑器打造您梦想中的赛道，并和其他玩家分享。谁能打造出最厉害的赛道，让我们拭目以待吧！您可以在各式各样的景观和世界上最崎岖的几种地形中做选择。\r\n\r\nPLAYGROUND (游乐场)\r\n　　在位于法国普罗旺斯的训练区域增进您的驾驶技术，您可以四处漫游，也可以在两条 MX 赛道、一条 SX 赛道和一条耐力赛赛道上竞速，并在其中试验不同的天气状况与日夜设置。完成一连串考验，证明您的速度、灵活性和空中操控技术，并取得独特的自定义套组！\r\n\r\n　　我们提供许多方法让玩家打造自定义的游戏内容，并与全世界的 Motocross 社区一较高下，而赛道编辑器正是其中之一！利用 Waypoint (路径点) 模式将比赛提升至下一个境界！您可以摆放检查点来创建专属路线，然后穿越这些检查点努力跑出最快时间，并于在线分享，就能获得实用的点数来推进游戏进度！\r\n\r\n更多自定义物品\r\n　　在 MXGP 及 MX2 的两冲程和四冲程摩托车中做选择，准备与对手一较高下，并利用无数种车手和摩托车选项来量身打造您的竞速体验。有超过 10,000 种物品供您选择，绝对能让您和您的摩托车抢尽众人目光。');
INSERT INTO `game` VALUES (27, 'PBA职业保龄球', 2, 1, 200, 'PBA职业保龄球', '2019-01-01 08:08:08', 'game2_blq.jpg', '系上保龄球鞋，体验《PBA职业保龄球,PBA Pro Bowling》创造的最逼真的保龄球模拟！\r\n\r\n　　专业保龄球协会和FarSight Studios合作创建了官方许可的PBA视频游戏。该游戏的职业模式包括在数十个场所中进行的100多个锦标赛，快速比赛和本地多人游戏模式、在线锦标赛等。游戏的发布中将包括19名PBA职业选手，其中包括Rob Stone和PBA传奇人物Randy Pederson的游戏内评论。');
INSERT INTO `game` VALUES (28, 'WWE 2K20', 2, 2, 200, 'WWE 2K20', '2019-01-01 08:08:08', 'game2_WWE 2K20.jpg', '关于游戏\r\n\r\n　　2K诚挚邀请广大玩家于10月22日登上《WWE 2K20》的震撼擂台。大家最喜爱的WWE巨星、传奇人物、名人堂成员以及NXT最强选手将会加入庆典，与您共同庆祝《WWE 2K》系列的重生！《WWE 2K20》将会带来关键的游戏玩法改进、更友好的精简操作，以及本系列迄今为止最具趣味性和创造力的游戏扩展。《WWE 2K20》还将推出全新的2K Showcase，为您详细讲述精彩故事：Four Horsewomen/Women\'s Evolution。经典回归的2K Towers和全新的MyCAREER模式让玩家能分别扮演不同性别的角色来进行游戏；而在Mixed Tag Match中，玩家也可选择男性或女性选手来加入混战。\r\n ');
INSERT INTO `game` VALUES (29, '高尔夫搞怪器', 2, 1, 200, '高尔夫搞怪器', '2019-01-01 08:08:08', 'game2_gggef.jpg', '这是一款基于物理的胡闹欢快型反高尔夫游戏，在此游戏里你将使用球杆击打任何东西。每个独立的关卡都是一种全新且令人感到惊喜的高尔夫玩法，时而精彩时而搞笑，可是大多数时候会荒诞到使您不禁感叹：WHAT THE GOLF?\r\n\r\n　　高尔夫还是那个熟悉的配方：完美的回合赛、18洞、晴空万里、绿草如茵的草地和穿着着漂亮服装的美丽俊俏之人。还有什么可讨厌的呢？——不再讨厌！');
INSERT INTO `game` VALUES (30, '飞行员运动', 2, 1, 200, '飞行员运动', '2019-01-01 08:08:08', 'game2_fxyyd.jpg', '《飞行员运动（Pilot Sports）》是一款由Z-Software制作并发行的超爽快飞行运动游戏，《Pilot Sports》拥有超过50条飞行路线，还有多种飞机和令人兴奋的挑战在等着你，提供各种各样的乐趣。选择你最喜欢的飞行员，探索这个热带岛屿天堂，在精彩又充满挑战的路线上翱翔。');
INSERT INTO `game` VALUES (31, '橄榄球冠军', 2, 1, 200, '橄榄球冠军', '2019-01-01 08:08:08', 'game2_glqyd.jpg', '　《橄榄球冠军（Rugby Champions）》将橄榄球的刺激和身体特性带到你的指尖，在有史以来最激烈的橄榄球比赛中，为每一米的场地而战，带领你的球队走向辉煌，创造历史，成为橄榄球冠军。');
INSERT INTO `game` VALUES (32, '魔物毕业舞会1', 3, 1, 200, '魔物毕业舞会', '2019-01-01 08:08:08', 'game3_mwbywh.jpg', '《魔物毕业舞会》是由Beautiful Glitch开发并由Those Awesome Guys发行的一款模拟游戏。游戏将基于选择分支的冒险游戏和约会模拟元素融为一体，你将扮演一名魔物高中的学生，在类似高校毕业舞会上体验做魔物难或是做想要在毕业舞会上找到约会对象的魔物更难。');
INSERT INTO `game` VALUES (33, '末日方舟', 3, 1, 200, '末日方舟', '2019-01-01 08:08:08', 'game3_mrfz.jpg', '　《末日方舟》是一款以生存策略为主题的体验类游戏。在这个游戏里，你不是生化危机里面的爱丽丝，只是一名普普通通的灾难危机之后幸存者。永远不要和僵尸正面硬刚。在这个僵尸横行的世界里探索、战斗、收集资源；与其他幸存者接触，选择帮助还是利用他们；通过学习，制造强化自己的庇护以及生存能力。最终希望你能够凭借自己的智慧和策略找到逃出生天的办法。');
INSERT INTO `game` VALUES (34, '玩具屋', 3, 1, 200, '玩具屋', '2019-01-01 08:08:08', 'game3_wjw.jpg', '《Dollhouse》是一款充满了黑色恐怖的影片式游戏，定会让你背脊发凉。经历一场深入侦探玛丽心灵的恐怖之旅。将你的过去拼凑起来，但是请当心，一些极度危险的家伙正在觊觎着你。\r\n\r\n　　这款充斥着猎杀元素的恐怖游戏充斥着神秘的黑色电影氛围。深入玛丽的心智，这是一位正在努力将自己过去记忆中的秘密揭示出来的侦探。使用“集中”功能，可以看到追猎者所看到的事物，努力从这场猫和老鼠的游戏中幸存下来。 \r\n\r\n特征：\r\n在单人游戏中解开你过去可怕的秘密，逃离你的追猎者 \r\n用超过40+的能力和被动技能自定义并升级你的角色 \r\n扫描周围的环境，通过追猎者的视角看待事物\r\n由程序生成的地图，任何游戏模式下的每一场游戏都不相同\r\n富有竞争性的多人游戏模式，合理选择你的行动，每位玩家都有不同的目标\r\n多人游戏中有14位可玩角色，每位都有独特的背景故事，深化你的恐怖体验');
INSERT INTO `game` VALUES (35, '单亲', 3, 1, 200, '单亲', '2019-01-01 08:08:08', 'game3_dq.jpg', '再平常不过的一天。你习惯性地要到街上去走走。你关上门，这时，突然有一个小女孩请你帮她找妈妈。从这时起，一切都变得不正常了。你处于危险之中。现在，你进入了这栋房子正在发生的噩梦中。但是，不要试图逃跑——你必须帮助这个小女孩…… 在这个游戏中，你将面临一些奇怪而可怕的事情——清除一切障碍，走向自由之路。你会遇到你房子里的可怕住户，他们是敌还是友？你有足够的勇气去调查清楚小女孩和她失踪妈妈的故事吗？硬核游戏、具有挑战性的谜题、压抑的氛围、持续不断的危险感正在等着你。 解开各种谜题，弄清所有故事的真相。你可以在电脑或虚拟现实设备上进行单人游戏，也可以和朋友一起双人合作游戏，平台不限。');
INSERT INTO `game` VALUES (36, '漫漫长夜', 3, 1, 200, '漫漫长夜', '2019-01-01 08:08:08', 'game3_mmcy.jpg', '游戏介绍\r\n\r\n《漫漫长夜（The Long Dark）》是一款充满思考的第一人称生存模拟游戏，着重强调探索元素，拥有令人难以忘怀的风景，背景设置在一场大灾难之后。\r\n\r\n欢迎来到《漫漫长夜》，这里有着创新的“探索 - 生存”体验，获得《连线》杂志“整个类型巅峰之作”的美誉。\r\n游戏玩法\r\n\r\n《漫漫长夜》是一款引人深思的探索生存类游戏。在游戏中，玩家需要在地磁灾难之后探索巨大的冰原荒野，你必须独立思考，找到出路。游戏中没有僵尸 -- 只有你、严寒和大自然中的所有残酷环境。 \r\n\r\n明亮之光横贯夜空，栖身木屋外凛冽寒风咆哮，远处狼嚎遥遥可闻。眼看背包中补给所剩无几，默默祈愿回到神秘停电前的美好时光。如此恶劣环境之下 -- 你能生存多久？\r\n\r\n《漫漫长夜》将会拥有两个模式，剧情模式以及生存沙盒模式，后者将会额外提供玩家数个小时的生存模拟体验。在该模式下，玩家在探索求生的同时还需时时监控自己的生命体征，包括卡路里，体温，疲劳，饥饿和干渴。');
INSERT INTO `game` VALUES (37, '甜蜜之家2', 3, 1, 200, '甜蜜之家', '2019-01-01 08:08:08', 'game3_tmzj.jpg', '\r\n\r\n　　剧情简介\r\n\r\n　　自从妻子失踪后，蒂姆不知疲倦地寻找她，但始终没有接近真相。在一个神秘的森林里，蒂姆觉得自己被吸引着去探索他神秘的新环境，却被一种邪恶的幽灵和一个神秘的、看不见的泰国舞蹈家所占据。蒂姆顽强地在森林里和其他地方搜寻着，他必须与时间赛跑，不仅要在他周围的邪恶势力中生存下来，还要拼凑线索，试图找到他失踪的妻子。\r\n');
INSERT INTO `game` VALUES (38, '锂：病囚39号', 3, 1, 200, '病囚', '2019-01-01 08:08:08', 'game3_bq39.jpg', '《锂：病囚39号》是一款恐怖题材的3D横版解谜游戏，玩家扮演的“哥布林”是个精神病患，必须活下来并找回自己的过去。游戏有30多种敌人和近百种致命陷阱组合，稍不留神就会尸骨无存，流程长度为20小时，将分为7个章节发售。');
INSERT INTO `game` VALUES (39, '无人深空', 3, 1, 200, '无人深空', '2019-01-01 08:08:08', 'game3_wrsk.jpg', '《无人深空》设定在一个宇宙的边缘，而玩家的任务就是回归这个宇宙的中心。在游戏中，玩家将自由自在的探索这个新鲜宇宙的全部空间。各种天体和星球一旦被玩家发现就会开始创建，每个都有属于自己独特的环境和完整的生态系统。 　　\r\n\r\n　　由于这是个在线游戏，一旦你发现了这个星球，它就也对其他玩家开放了。玩家对星球的探索不仅仅限于发现，他们还可以给这个星球带来显著的变化，而这些变化也会对后来的玩家产生影响。');
INSERT INTO `game` VALUES (40, '瘟疫2', 3, 1, 200, '瘟疫', '2019-01-01 08:08:08', 'game3_wy2.jpg', '玩家们将身处一个开放的世界当中，这个城镇正在被恐怖而且致命的瘟疫所笼罩，面对逐渐崩溃的世界，你需要在不同的情况下做出艰难的选择。 恐怖的瘟疫非常致命，你很难保证每一个人的生存。你要做的就是获得当地人的信任，成为他们的盟友，让他们帮助生存下来。当然你也可以尝试完全凭借自己的力量活下去！');
INSERT INTO `game` VALUES (41, '噬神者3', 4, 1, 200, '噬神者3', '2019-01-01 08:08:08', 'game4_ssz3.jpg', '《噬神者3》的背景设定在荒废的近未来，吞噬一切事物的荒神让世界面对崩坏的危机，人类仅存的希望只有操控神机的人体兵器“噬神者”，主角作为一名新的噬神者，将和自己的伙伴在限制区域内投入战斗。');
INSERT INTO `game` VALUES (42, '地狱门', 4, 1, 200, '地狱门', '2019-01-01 08:08:08', 'game4_dym.jpg', '《地狱门,Gates of Hell》是一款第一人称视角恐怖动作游戏，在穿越地狱之门后你无处躲藏，面对恐怖的恶魔，鲜血淋漓的丧尸，变异的人类，黑暗的巫师，活泼的头骨和巨大的BOSS，继续前进，寻找强大的天使与恶魔装备，并尽可能长地活下去。');
INSERT INTO `game` VALUES (43, '尘埃', 6, 1, 200, '尘埃', '2019-01-01 08:08:08', 'game6_ca4.jpg', '世界领先的越野赛系列游戏回归了！《DiRT 4》让你驾驶有史以来最强的赛车去面对这个星球的拉力赛、rallycross 和 landrush 中危险重重的赛道和环路。\r\n\r\n　　凭借革命性的“你的赛段”技术，只要触摸一个按钮，即可在澳大利亚、西班牙、Michigan、瑞典和 Wales 为你提供无数条公路赛车道。');
INSERT INTO `game` VALUES (44, '极品飞车21', 6, 1, 200, '极品飞车', '2019-01-01 08:08:08', 'game6_jpfc21.jpg', '《极品飞车：热度》是由Ghost Games制作，EA发行的《极品飞车》系列游戏新作。该系列虔诚地展现了真实赛车文化，有着出色的画面和酷炫的音效，Ghost Games也在不断优化车辆驾驶和漂移的手感，以求带给玩家更棒的游戏体验。');
INSERT INTO `game` VALUES (45, '激速竞速街头', 6, 1, 200, '激速竞速街头', '2019-01-01 08:08:08', 'game6_jsjsjt.jpg', '《极限竞速街头赛》的设计初衷就在于“随时随地的游戏，并且激发出爱车族的热情”。这款新游戏在操作控制上有所精简，玩家们只要把握好加速和刹车的时机，就能在比赛中获得优势。在简单的快速游戏基础上，游戏也搭配了故事模式。玩家们可以在比赛中获得奖励，收集和改装各种各样的赛车，体验电影般的赛车运动。');
INSERT INTO `game` VALUES (75, '英雄联盟', 1, 1, 200, '啊啊啊', '2020-05-21 16:00:00', '75_game.jpg', '英雄联盟英雄联盟英雄联盟英雄联盟英雄联盟');
INSERT INTO `game` VALUES (85, '潘阳', 1, 1, 100, '阿松大', '2021-01-24 16:00:00', '85_game.png', '撒旦撒');
INSERT INTO `game` VALUES (86, 'Boyz II Men', 4, 1, 100, 'Boyz II Men', '2022-04-24 16:00:00', '86_game.png', 'Boyz II Men');
INSERT INTO `game` VALUES (87, 'Tale of Revemge', 5, 1, 100, 'Tale of Revemge', '2022-04-24 16:00:00', '87_game.png', 'Tale of Revemge');
INSERT INTO `game` VALUES (88, 'The Lost City of Z', 4, 1, 100, 'The Lost City of Z', '2022-05-06 16:00:00', '88_game.png', 'The Lost City of Z');
INSERT INTO `game` VALUES (89, 'Beast Beauty', 1, 1, 100, 'Beast Beauty', '2022-04-24 16:00:00', '89_game.png', 'Beast Beauty');
INSERT INTO `game` VALUES (90, 'Furi', 1, 1, 100, 'Furi', '2022-05-17 16:00:00', '90_game.jpg', 'The jailer is the key, kill him and you’ll be free.');

-- ----------------------------
-- Table structure for header
-- ----------------------------
DROP TABLE IF EXISTS `header`;
CREATE TABLE `header`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `filename` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `src` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '/header/',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of header
-- ----------------------------
INSERT INTO `header` VALUES (1, 'jinx.jpg', '/header/pp.webp');
INSERT INTO `header` VALUES (2, 'pp.jpg', '/header/wxm.jpg');
INSERT INTO `header` VALUES (3, 'pp.jpg', '/header/pp.jpg');
INSERT INTO `header` VALUES (4, NULL, '/header/');
INSERT INTO `header` VALUES (5, NULL, '/header/');
INSERT INTO `header` VALUES (6, NULL, '/header/');
INSERT INTO `header` VALUES (7, NULL, '/header/');
INSERT INTO `header` VALUES (8, NULL, '/header/');
INSERT INTO `header` VALUES (9, NULL, '/header/');
INSERT INTO `header` VALUES (10, NULL, '/header/');
INSERT INTO `header` VALUES (11, NULL, '/header/');
INSERT INTO `header` VALUES (12, NULL, '/header/');
INSERT INTO `header` VALUES (13, NULL, '/header/');
INSERT INTO `header` VALUES (14, NULL, '/header/');
INSERT INTO `header` VALUES (15, NULL, '/header/');
INSERT INTO `header` VALUES (16, NULL, '/header/');
INSERT INTO `header` VALUES (17, NULL, '/header/');
INSERT INTO `header` VALUES (18, NULL, '/header/');
INSERT INTO `header` VALUES (19, NULL, '/header/');
INSERT INTO `header` VALUES (20, NULL, '/header/');
INSERT INTO `header` VALUES (21, NULL, '/header/');
INSERT INTO `header` VALUES (22, NULL, '/header/');
INSERT INTO `header` VALUES (23, NULL, '/header/');
INSERT INTO `header` VALUES (24, NULL, '/header/');
INSERT INTO `header` VALUES (25, NULL, '/header/');
INSERT INTO `header` VALUES (26, NULL, '/header/');
INSERT INTO `header` VALUES (27, NULL, '/header/');
INSERT INTO `header` VALUES (28, NULL, '/header/');
INSERT INTO `header` VALUES (29, NULL, '/header/');
INSERT INTO `header` VALUES (30, NULL, '/header/');
INSERT INTO `header` VALUES (31, NULL, '/header/');
INSERT INTO `header` VALUES (32, NULL, '/header/');
INSERT INTO `header` VALUES (33, NULL, '/header/asdqwe.jpg');
INSERT INTO `header` VALUES (34, NULL, '/header/刘耕宏.png');
INSERT INTO `header` VALUES (35, NULL, '/header/刘耕宏男孩.webp');
INSERT INTO `header` VALUES (36, NULL, '/header/刘耕宏哥哥.webp');
INSERT INTO `header` VALUES (37, NULL, '/header/neusoft123.jpg');
INSERT INTO `header` VALUES (38, NULL, '/header/');
INSERT INTO `header` VALUES (39, NULL, '/header/neusoft1234.jpg');
INSERT INTO `header` VALUES (40, NULL, '/header/neusoft12345.jpg');

-- ----------------------------
-- Table structure for library
-- ----------------------------
DROP TABLE IF EXISTS `library`;
CREATE TABLE `library`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT 'userId',
  `game_id` int(11) NOT NULL COMMENT 'gameId',
  PRIMARY KEY (`user_id`, `game_id`) USING BTREE,
  INDEX `library_id_index`(`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of library
-- ----------------------------
INSERT INTO `library` VALUES (1, 1, 1);
INSERT INTO `library` VALUES (2, 35, 1);
INSERT INTO `library` VALUES (3, 36, 1);
INSERT INTO `library` VALUES (4, 36, 2);
INSERT INTO `library` VALUES (5, 36, 3);

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `game_id` int(11) NOT NULL DEFAULT -1 COMMENT 'gameId',
  `file_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT 'fileName',
  `src` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT 'src',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 117 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of picture
-- ----------------------------
INSERT INTO `picture` VALUES (1, 2, '2_0.jpeg', '2_0.jpeg');
INSERT INTO `picture` VALUES (2, 2, '2_1.jpg', '2_1.jpg');
INSERT INTO `picture` VALUES (3, 2, '2_2.jpg', '2_2.jpg');
INSERT INTO `picture` VALUES (4, 1, '1_0.png', '1_0.png');
INSERT INTO `picture` VALUES (5, 1, '1_1.jpg', '1_1.jpg');
INSERT INTO `picture` VALUES (6, 1, '1_2.jpg', '1_2.jpg');
INSERT INTO `picture` VALUES (7, 10, '10_1.jpg', '10_1.jpg');
INSERT INTO `picture` VALUES (8, 10, '10_2.jpg', '10_2.jpg');
INSERT INTO `picture` VALUES (9, 10, '10_3.jpg', '10_3.jpg');
INSERT INTO `picture` VALUES (10, 10, '10_4.jpg', '10_4.jpg');
INSERT INTO `picture` VALUES (11, 10, '10_5.jpg', '10_5.jpg');
INSERT INTO `picture` VALUES (12, 16, '16_1.jpg', '16_1.jpg');
INSERT INTO `picture` VALUES (13, 21, '21_1.jpg', '21_1.jpg');
INSERT INTO `picture` VALUES (14, 41, '41_1.jpg', '41_1.jpg');
INSERT INTO `picture` VALUES (15, 41, '41_3.jpg', '41_3.jpg');
INSERT INTO `picture` VALUES (16, 41, '41_1.jpg', '41_1.jpg');
INSERT INTO `picture` VALUES (17, 42, '42_3.jpg', '42_3.jpg');
INSERT INTO `picture` VALUES (18, 42, '42_2.jpg', '42_2.jpg');
INSERT INTO `picture` VALUES (20, 42, '42_1.jpg', '42_1.jpg');
INSERT INTO `picture` VALUES (21, 43, '43_1.png', '43_1.png');
INSERT INTO `picture` VALUES (22, 43, '43_2.jpg', '43_2.jpg');
INSERT INTO `picture` VALUES (23, 43, '43_3.jpg', '43_3.jpg');
INSERT INTO `picture` VALUES (24, 44, '44_1.jpg', '44_1.jpg');
INSERT INTO `picture` VALUES (25, 44, '44_2.jpg', '44_2.jpg');
INSERT INTO `picture` VALUES (26, 44, '44_3.jpg', '44_3.jpg');
INSERT INTO `picture` VALUES (27, 45, '45_1.jpg', '45_1.jpg');
INSERT INTO `picture` VALUES (28, 45, '45_2.jpg', '45_2.jpg');
INSERT INTO `picture` VALUES (29, 45, '45_3.jpg', '45_3.jpg');
INSERT INTO `picture` VALUES (30, 3, '3_0.jpg', '3_0.jpg');
INSERT INTO `picture` VALUES (31, 3, '3_1.jpg', '3_1.jpg');
INSERT INTO `picture` VALUES (32, 3, '3_2.jpg', '3_2.jpg');
INSERT INTO `picture` VALUES (33, 4, '4_0.webp', '4_0.webp');
INSERT INTO `picture` VALUES (34, 4, '4_1.webp', '4_1.webp');
INSERT INTO `picture` VALUES (35, 4, '4_2.webp', '4_2.webp');
INSERT INTO `picture` VALUES (36, 5, '5_0.jpg', '5_0.jpg');
INSERT INTO `picture` VALUES (37, 5, '5_1.jpg', '5_1.jpg');
INSERT INTO `picture` VALUES (38, 5, '5_2.jpg', '5_2.jpg');
INSERT INTO `picture` VALUES (39, 6, '6_0.jpg', '6_0.jpg');
INSERT INTO `picture` VALUES (40, 6, '6_1.jpg', '6_1.jpg');
INSERT INTO `picture` VALUES (41, 6, '6_2.jpg', '6_2.jpg');
INSERT INTO `picture` VALUES (42, 63, '63_0.jpg', '63_0.jpg');
INSERT INTO `picture` VALUES (43, 63, '63_1.jpg', '63_1.jpg');
INSERT INTO `picture` VALUES (44, 63, '63_2.jpg', '63_2.jpg');
INSERT INTO `picture` VALUES (45, 99, '1_3.jpg', '1_3.jpg');
INSERT INTO `picture` VALUES (46, 99, '1_4.jpg', '1_4.jpg');
INSERT INTO `picture` VALUES (47, 99, '1_5.jpg', '1_5.jpg');
INSERT INTO `picture` VALUES (48, 65, '65_0.jpg', '65_0.jpg');
INSERT INTO `picture` VALUES (49, 65, '65_1.jpg', '65_1.jpg');
INSERT INTO `picture` VALUES (50, 65, '65_2.jpg', '65_2.jpg');
INSERT INTO `picture` VALUES (51, 73, '73_0.jpg', '73_0.jpg');
INSERT INTO `picture` VALUES (52, 73, '73_1.jpg', '73_1.jpg');
INSERT INTO `picture` VALUES (53, 73, '73_2.jpg', '73_2.jpg');
INSERT INTO `picture` VALUES (54, 74, '74_0.jpg', '74_0.jpg');
INSERT INTO `picture` VALUES (55, 74, '74_1.jpg', '74_1.jpg');
INSERT INTO `picture` VALUES (56, 74, '74_2.png', '74_2.png');
INSERT INTO `picture` VALUES (57, 75, '75_0.jpg', '75_0.jpg');
INSERT INTO `picture` VALUES (58, 75, '75_1.jpg', '75_1.jpg');
INSERT INTO `picture` VALUES (59, 75, '75_2.jpg', '75_2.jpg');
INSERT INTO `picture` VALUES (60, 81, '81_0.png', '81_0.png');
INSERT INTO `picture` VALUES (61, 81, '81_1.png', '81_1.png');
INSERT INTO `picture` VALUES (62, 81, '81_2.png', '81_2.png');
INSERT INTO `picture` VALUES (63, 82, '82_0.jpg', '82_0.jpg');
INSERT INTO `picture` VALUES (64, 82, '82_1.jpg', '82_1.jpg');
INSERT INTO `picture` VALUES (65, 82, '82_2.jpg', '82_2.jpg');
INSERT INTO `picture` VALUES (66, 76, '76_0.jpg', '76_0.jpg');
INSERT INTO `picture` VALUES (67, 76, '76_1.jpg', '76_1.jpg');
INSERT INTO `picture` VALUES (68, 76, '76_2.jpg', '76_2.jpg');
INSERT INTO `picture` VALUES (69, 77, '77_0.png', '77_0.png');
INSERT INTO `picture` VALUES (70, 77, '77_1.jpg', '77_1.jpg');
INSERT INTO `picture` VALUES (71, 77, '77_2.png', '77_2.png');
INSERT INTO `picture` VALUES (72, 78, '78_0.jpg', '78_0.jpg');
INSERT INTO `picture` VALUES (73, 78, '78_1.png', '78_1.png');
INSERT INTO `picture` VALUES (74, 79, '79_0.jpg', '79_0.jpg');
INSERT INTO `picture` VALUES (75, 79, '79_1.png', '79_1.png');
INSERT INTO `picture` VALUES (76, 80, '80_0.jpg', '80_0.jpg');
INSERT INTO `picture` VALUES (77, 80, '80_1.png', '80_1.png');
INSERT INTO `picture` VALUES (78, 80, '80_2.jpg', '80_2.jpg');
INSERT INTO `picture` VALUES (79, 81, '81_3.jpg', '81_3.jpg');
INSERT INTO `picture` VALUES (80, 81, '81_4.png', '81_4.png');
INSERT INTO `picture` VALUES (81, 82, '82_3.jpg', '82_3.jpg');
INSERT INTO `picture` VALUES (82, 82, '82_4.png', '82_4.png');
INSERT INTO `picture` VALUES (83, 82, '82_5.jpg', '82_5.jpg');
INSERT INTO `picture` VALUES (84, 83, '83_0.jpg', '83_0.jpg');
INSERT INTO `picture` VALUES (85, 83, '83_1.png', '83_1.png');
INSERT INTO `picture` VALUES (86, 83, '83_2.jpg', '83_2.jpg');
INSERT INTO `picture` VALUES (87, 84, '84_0.jpg', '84_0.jpg');
INSERT INTO `picture` VALUES (88, 85, '85_0.png', '85_0.png');
INSERT INTO `picture` VALUES (89, 85, '85_1.png', '85_1.png');
INSERT INTO `picture` VALUES (90, 85, '85_2.png', '85_2.png');
INSERT INTO `picture` VALUES (91, 86, '86_0.jpg', '86_0.jpg');
INSERT INTO `picture` VALUES (92, 85, '85_3.png', '85_3.png');
INSERT INTO `picture` VALUES (93, 86, '86_1.jpg', '86_1.jpg');
INSERT INTO `picture` VALUES (94, 86, '86_2.jpg', '86_2.jpg');
INSERT INTO `picture` VALUES (95, 86, '86_3.png', '86_3.png');
INSERT INTO `picture` VALUES (96, 86, '86_4.png', '86_4.png');
INSERT INTO `picture` VALUES (97, 86, '86_5.png', '86_5.png');
INSERT INTO `picture` VALUES (98, 86, '86_6.png', '86_6.png');
INSERT INTO `picture` VALUES (99, 87, '87_0.png', '87_0.png');
INSERT INTO `picture` VALUES (100, 87, '87_1.png', '87_1.png');
INSERT INTO `picture` VALUES (101, 87, '87_2.png', '87_2.png');
INSERT INTO `picture` VALUES (102, 88, '88_0.png', '88_0.png');
INSERT INTO `picture` VALUES (103, 88, '88_1.png', '88_1.png');
INSERT INTO `picture` VALUES (104, 88, '88_2.png', '88_2.png');
INSERT INTO `picture` VALUES (105, 89, '89_0.png', '89_0.png');
INSERT INTO `picture` VALUES (106, 89, '89_1.png', '89_1.png');
INSERT INTO `picture` VALUES (107, 89, '89_2.png', '89_2.png');
INSERT INTO `picture` VALUES (108, 90, '90_0.jpg', '90_0.jpg');
INSERT INTO `picture` VALUES (109, 90, '90_1.jpg', '90_1.jpg');
INSERT INTO `picture` VALUES (110, 90, '90_2.jpg', '90_2.jpg');
INSERT INTO `picture` VALUES (111, 91, '91_0.jpg', '91_0.jpg');
INSERT INTO `picture` VALUES (112, 91, '91_1.jpg', '91_1.jpg');
INSERT INTO `picture` VALUES (113, 91, '91_2.jpg', '91_2.jpg');
INSERT INTO `picture` VALUES (114, 92, '92_0.jpg', '92_0.jpg');
INSERT INTO `picture` VALUES (115, 92, '92_1.jpg', '92_1.jpg');
INSERT INTO `picture` VALUES (116, 92, '92_2.jpg', '92_2.jpg');

-- ----------------------------
-- Table structure for platform
-- ----------------------------
DROP TABLE IF EXISTS `platform`;
CREATE TABLE `platform`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT 'name',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of platform
-- ----------------------------
INSERT INTO `platform` VALUES (1, 'Pc');
INSERT INTO `platform` VALUES (2, 'Ps4');
INSERT INTO `platform` VALUES (3, 'XBOX ONE');
INSERT INTO `platform` VALUES (4, 'XBOX 360');
INSERT INTO `platform` VALUES (5, 'PSV');

-- ----------------------------
-- Table structure for review
-- ----------------------------
DROP TABLE IF EXISTS `review`;
CREATE TABLE `review`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `game_id` int(11) NOT NULL DEFAULT -1 COMMENT 'gameId',
  `user_id` int(11) NOT NULL DEFAULT -1 COMMENT 'userId',
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT 'title',
  `content` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT 'content',
  `pub_date` datetime(0) NOT NULL DEFAULT '2017-01-01 12:00:00' COMMENT 'pubDate',
  `up_date` datetime(0) NOT NULL DEFAULT '2017-01-01 13:00:00' COMMENT 'upDate',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of review
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `header_id` int(11) NULL DEFAULT 1,
  `money` double NULL DEFAULT 0,
  `register_date` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT 'registerDate',
  `is_admin` int(11) NOT NULL DEFAULT 0 COMMENT 'isAdmin',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_name`(`name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'pp', '7c4a8d09ca3762af61e59520943dc26494f8941b', 1, 1090, '2019-11-05 08:29:28', 1);
INSERT INTO `user` VALUES (2, 'wxm', '7c4a8d09ca3762af61e59520943dc26494f8941b', 2, 984, '2019-11-05 08:34:59', 0);
INSERT INTO `user` VALUES (3, 'HJG', '7c4a8d09ca3762af61e59520943dc26494f8941b', 1, 0, '2020-03-07 20:20:53', 0);
INSERT INTO `user` VALUES (31, 'nihao', '0f2c595baa1fac2457a5970eb17f735ffedd0c40', 1, 123, '2020-03-24 17:57:09', 1);
INSERT INTO `user` VALUES (32, '王德发', '9adcb29710e807607b683f62e555c22dc5659713', 1, 100, '2022-04-19 03:44:58', 1);
INSERT INTO `user` VALUES (33, '爷灬傲奈我何', '123', 1, 200, '2022-04-19 03:46:25', 0);
INSERT INTO `user` VALUES (34, '刘耕宏', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 1, 0, '2022-05-17 12:11:31', 0);
INSERT INTO `user` VALUES (35, '刘耕男孩', '7c4a8d09ca3762af61e59520943dc26494f8941b', 1, 900, '2022-05-18 06:39:22', 0);
INSERT INTO `user` VALUES (36, '刘哥哥', '7c4a8d09ca3762af61e59520943dc26494f8941b', 1, 680, '2022-05-18 08:47:20', 0);

-- ----------------------------
-- View structure for view_games
-- ----------------------------
DROP VIEW IF EXISTS `view_games`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_games` AS select `t1`.`id` AS `id`,`t1`.`name` AS `name`,`t2`.`name` AS `category`,`t3`.`name` AS `platform`,`t1`.`price` AS `price`,`t1`.`description` AS `description`,`t1`.`pubdate` AS `pubdate` from (`game` `t1` left join (`category` `t2` join `platform` `t3`) on(((`t1`.`category_id` = `t2`.`id`) and (`t1`.`platform_id` = `t3`.`id`))));

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '饥荒', '休闲', 'Pc', 100, '饥荒', '2022-03-08 16:00:00');
INSERT INTO `user` VALUES (2, '歧路旅人', '休闲', 'Pc', 20, '歧路旅人', '1970-01-01 00:00:00');
INSERT INTO `user` VALUES (3, '使命召唤：黑色行动', '休闲', 'Pc', 200, '使命召唤', '1969-12-31 16:00:00');
INSERT INTO `user` VALUES (4, '鬼泣3', '休闲', 'Pc', 300, '鬼泣3', '2016-12-31 16:00:00');
INSERT INTO `user` VALUES (5, '鬼泣4', '休闲', 'Pc', 300, '鬼泣4', '2016-12-31 16:00:00');
INSERT INTO `user` VALUES (6, '刺客信条·起源', '休闲', 'Pc', 360, '刺客信条·起源', '2016-12-31 16:00:00');
INSERT INTO `user` VALUES (7, '人类一败涂地', '休闲', 'Ps4', 20, '人类一败涂地', '2017-01-01 08:08:08');
INSERT INTO `user` VALUES (8, '刺客信条', '动作', 'Ps4', 200, '刺客信条', '2017-01-01 08:08:08');
INSERT INTO `user` VALUES (9, '鬼泣5', '休闲', 'Pc', 200, '鬼泣5', '2018-12-31 16:00:00');
INSERT INTO `user` VALUES (10, '控制', '动作', 'Pc', 200, '控制', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (11, '虐杀原形', '动作', 'Ps4', 200, '虐杀原形', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (12, '绝地求生大逃杀', '大型多人在线', 'Pc', 98, '绝地求生', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (13, '极品飞车', '竞速', 'Pc', 200, '极品飞车', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (14, '怪物猎人世界', NULL, NULL, 200, '怪物猎人', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (15, '看门狗', NULL, NULL, 200, '看门狗', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (16, '愤怒的小鸟', '休闲', 'Pc', 200, '愤怒的小鸟', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (17, '植物大战僵尸', '休闲', 'Pc', 200, '植物大战僵尸', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (18, '球球大作战', '休闲', 'Pc', 200, '球球大作战', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (19, '桥梁构造者', '休闲', 'Pc', 200, '桥梁构造者', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (20, '水果忍者', '休闲', 'Pc', 200, '水果忍者', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (21, '节奏次元', '休闲', 'Pc', 200, '节奏次元', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (22, 'Imbroglio', '休闲', 'Pc', 200, 'Imbroglio', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (23, 'NBA 2K游乐场2 ', '体育', 'Ps4', 200, 'NBA 2K游乐场2 官方中文正式版', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (24, '实况足球2020', '体育', 'Ps4', 200, '实况足球2020 中文版', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (25, '孤山速降', '体育', 'Pc', 200, '孤山速降', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (26, '越野摩托2019', '体育', 'Pc', 200, '越野摩托2019', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (27, 'PBA职业保龄球', '体育', 'Pc', 200, 'PBA职业保龄球', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (28, 'WWE 2K20', '体育', 'Ps4', 200, 'WWE 2K20', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (29, '高尔夫搞怪器', '体育', 'Pc', 200, '高尔夫搞怪器', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (30, '飞行员运动', '体育', 'Pc', 200, '飞行员运动', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (31, '橄榄球冠军', '体育', 'Pc', 200, '橄榄球冠军', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (32, '魔物毕业舞会1', '冒险', 'Pc', 200, '魔物毕业舞会', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (33, '末日方舟', '冒险', 'Pc', 200, '末日方舟', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (34, '玩具屋', '冒险', 'Pc', 200, '玩具屋', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (35, '单亲', '冒险', 'Pc', 200, '单亲', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (36, '漫漫长夜', '冒险', 'Pc', 200, '漫漫长夜', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (37, '甜蜜之家2', '冒险', 'Pc', 200, '甜蜜之家', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (38, '锂：病囚39号', '冒险', 'Pc', 200, '病囚', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (39, '无人深空', '冒险', 'Pc', 200, '无人深空', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (40, '瘟疫2', '冒险', 'Pc', 200, '瘟疫', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (41, '噬神者3', '动作', 'Pc', 200, '噬神者3', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (42, '地狱门', '动作', 'Pc', 200, '地狱门', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (43, '尘埃', '竞速', 'Pc', 200, '尘埃', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (44, '极品飞车21', '竞速', 'Pc', 200, '极品飞车', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (45, '激速竞速街头', '竞速', 'Pc', 200, '激速竞速街头', '2019-01-01 08:08:08');
INSERT INTO `user` VALUES (75, '英雄联盟', '休闲', 'Pc', 200, '啊啊啊', '2020-05-21 16:00:00');
INSERT INTO `user` VALUES (85, '潘阳', '休闲', 'Pc', 100, '阿松大', '2021-01-24 16:00:00');
INSERT INTO `user` VALUES (86, 'Boyz II Men', '动作', 'Pc', 100, 'Boyz II Men', '2022-04-24 16:00:00');
INSERT INTO `user` VALUES (87, 'Tale of Revemge', '大型多人在线', 'Pc', 100, 'Tale of Revemge', '2022-04-24 16:00:00');
INSERT INTO `user` VALUES (88, 'The Lost City of Z', '动作', 'Pc', 100, 'The Lost City of Z', '2022-05-06 16:00:00');
INSERT INTO `user` VALUES (89, 'Beast Beauty', '休闲', 'Pc', 100, 'Beast Beauty', '2022-04-24 16:00:00');
INSERT INTO `user` VALUES (90, 'Furi', '休闲', 'Pc', 100, 'Furi', '2022-05-17 16:00:00');

SET FOREIGN_KEY_CHECKS = 1;
